package com.example.wikipedia_test.Fragment

import android.app.Activity.RESULT_OK
import android.app.Dialog
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.BitmapShader
import android.graphics.Canvas
import android.graphics.Interpolator
import android.graphics.Paint
import android.graphics.Shader
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.PopupMenu
import androidx.fragment.app.Fragment
import com.example.wikipedia_test.R
import com.example.wikipedia_test.databinding.FragmentProfileBinding
import com.google.android.material.floatingactionbutton.FloatingActionButton

const val SELECT_IMAGE_REQUEST_CODE = 100
const val TAKE_PICTURE_REQUEST_CODE = 200

class Fragment_Profile : Fragment() {
    private lateinit var binding: FragmentProfileBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentProfileBinding.inflate(layoutInflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.fabmain.setOnClickListener {
            showPopupMenu(view)
        }




        binding.btnedit.setOnClickListener {
                //دریافت مقادیر فعلی
            val fullname = binding.txtfullname.text.toString()
            val ID = binding.txtid.text.toString()
            val number = binding.txtNUMBER.text.toString()
            val email = binding.txtEmail.text.toString()

            //ایجاد یک دیالوگ
            val dialog = Dialog(requireContext())
            dialog.setContentView(R.layout.dialog_edit)
            val titleedittext: EditText = dialog.findViewById(R.id.dialog_edt_fullname)
            titleedittext.setText(fullname)
            val txtid: EditText = dialog.findViewById(R.id.dialog_edt_id)
            txtid.setText(ID)
            val txtnumber: EditText = dialog.findViewById(R.id.dialog_edt_number)
            txtnumber.setText(number)
            val txtemail: EditText = dialog.findViewById(R.id.dialog_edt_email)
            txtemail.setText(email)

            //ست ان کلیک لیستنر برای دکمه ی دان
            val save: Button = dialog.findViewById(R.id.dialog_update_btn_done)
            save.setOnClickListener {


            //ذخیره ی مقادیر جدید
                val newName = titleedittext.text.toString()
                val newid = txtid.text.toString()
                val newnumber = txtnumber.text.toString()
                val newemail = txtemail.text.toString()

                // پاس دادن مقادیر جدید به جای مقادیر قدیمی
                binding.txtfullname.text = newName
                binding.txtid.text = newid
                binding.txtNUMBER.text = newnumber
                binding.txtEmail.text = newemail



                dialog.dismiss()
            }
            dialog.show()

        }


    }







    private fun showPopupMenu(view: View) {
        val fab: FloatingActionButton = binding.fabmain
        val popup = PopupMenu(context, fab)
        popup.inflate(R.menu.popup_menu)
        popup.setOnMenuItemClickListener { item ->
            when (item.itemId) {
                R.id.select_image -> {
                    selectImage()
                    true
                }
                R.id.take_picture -> {
                    takePicture()
                    true
                }
                else -> false
            }
        }
        popup.show()
    }

    private fun selectImage() {
        val intent = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
        startActivityForResult(intent, SELECT_IMAGE_REQUEST_CODE)
    }

    private fun takePicture() {
        val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        startActivityForResult(intent, TAKE_PICTURE_REQUEST_CODE)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (resultCode == RESULT_OK) {
            when (requestCode) {
                SELECT_IMAGE_REQUEST_CODE -> {
                    val uri = data?.data
                    if (uri != null) {
                        val bitmap = BitmapFactory.decodeStream(
                            requireContext().contentResolver.openInputStream(uri)
                        )
                        binding.imgDetail.setImageBitmap(bitmap)
                    }
                }
                TAKE_PICTURE_REQUEST_CODE -> {
                    val bitmap = data?.extras?.get("data") as? Bitmap
                    if (bitmap != null) {
                        binding.imgDetail.setImageBitmap(bitmap)
                    }
                }
            }
        }
    }


}





