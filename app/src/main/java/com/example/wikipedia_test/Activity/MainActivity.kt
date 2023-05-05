package com.example.wikipedia_test.Activity

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.fragment.app.Fragment
import cn.pedant.SweetAlert.SweetAlertDialog
import com.example.wikipedia_test.Fragment.*
import com.example.wikipedia_test.R
import com.example.wikipedia_test.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        setSupportActionBar(binding.toolbarmain)

        val actionBarDrawerToggle = ActionBarDrawerToggle(
            this,
            binding.drawerlayoutmain,
            binding.toolbarmain,
            R.string.open_drawer,
            R.string.close_drawer
        )
        actionBarDrawerToggle.syncState()
        binding.drawerlayoutmain.addDrawerListener(actionBarDrawerToggle)


        binding.navigationviewmain.setNavigationItemSelectedListener {

            when (it.itemId) {

                R.id.menu_writer -> {

                    Snackbar.make(binding.root, "writer menu ! ", Snackbar.LENGTH_SHORT)
                        .show()
                    binding.drawerlayoutmain.closeDrawer(GravityCompat.START)

                    val dialog = SweetAlertDialog(this, SweetAlertDialog.NORMAL_TYPE)
                    dialog.titleText = "alert"
                    dialog.confirmText = "confirm"
                    dialog.cancelText = "cancel"
                    dialog.contentText = "want be a writer ? "
                    dialog.setCancelClickListener {
                        dialog.dismiss()
                    }

                    dialog.setConfirmClickListener {
                        val uri =
                            "https://en.wikipedia.org/wiki/Help:Introduction_to_editing_with_VisualEditor/1"
                        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(uri))
                        startActivity(intent)
                        Toast.makeText(this, "good luck :)", Toast.LENGTH_SHORT).show()
                        dialog.dismiss()
                    }
                    dialog.show()

                }

                R.id.movimaker_menu -> {
                    val uri = "https://en.wikipedia.org/wiki/MovieMaker"
                    val intent = Intent(Intent.ACTION_VIEW , Uri.parse(uri))
                    startActivity(intent)

                    binding.drawerlayoutmain.closeDrawer(GravityCompat.START)

                    Snackbar.make(binding.root, "good luck :) ", Snackbar.LENGTH_SHORT)
                        .show()


                }

                R.id.photograph -> {
                    Snackbar.make(binding.root, "photograph menu ! ", Snackbar.LENGTH_SHORT)
                        .show()
                    val transAction = supportFragmentManager.beginTransaction()
                    transAction.add(R.id.framemaincontiner, FragmentPhotographer())
                    transAction.addToBackStack(null)
                    transAction.commit()


                    binding.navigationviewmain.menu.getItem(1).isChecked = true

                    binding.drawerlayoutmain.closeDrawer(GravityCompat.START)
                }

                R.id.showwikimedia -> {
                    Snackbar.make(binding.root, "wikimedia menu ! ", Snackbar.LENGTH_SHORT)
                        .show()
                    openwebsite("https://www.wikimedia.org/")
                    binding.drawerlayoutmain.closeDrawer(GravityCompat.START)


                }

                R.id.showwikipedia -> {
                    Snackbar.make(binding.root, "wikipedia menu ! ", Snackbar.LENGTH_SHORT)
                        .show()
                    binding.drawerlayoutmain.closeDrawer(GravityCompat.START)
                    val dialog = SweetAlertDialog(this, SweetAlertDialog.NORMAL_TYPE)
                    dialog.titleText = "alert"
                    dialog.contentText = "do yo need to see wikipedia ? "
                    dialog.cancelText = "cancel"
                    dialog.confirmText = "confirm"

                    dialog.setConfirmClickListener {
                        val url = "https://www.wikipedia.org/"
                        val inent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                        startActivity(inent)
                        Toast.makeText(this, "good luck :)", Toast.LENGTH_SHORT).show()
                        dialog.dismiss()
                    }

                    dialog.setCancelClickListener {
                        dialog.dismiss()
                    }
                    dialog.show()
                }

                R.id.translater -> {
                    Snackbar.make(binding.root, "translate menu ", Snackbar.LENGTH_SHORT)
                        .show()

                    val intent = Intent(this, MainActivity3::class.java)
                    startActivity(intent)


                    binding.drawerlayoutmain.closeDrawer(GravityCompat.START)

                }

            }
            binding.navigationviewmain.menu.getItem(1).isChecked = false
            true
        }

        firstrun()
        binding.bottonnavigationmain.setOnItemSelectedListener {

            when (it.itemId) {
                R.id.trend -> {
                    Snackbar.make(binding.root, "trend ", Snackbar.LENGTH_SHORT)
                        .show()
                    replaceFragment(Fragment_Trend())
                }
                R.id.explore -> {
                    Snackbar.make(binding.root, "explore ", Snackbar.LENGTH_SHORT)
                        .show()
                    replaceFragment(Fragment_Explore())
                }
                R.id.progile_menu -> {
                    Snackbar.make(binding.root, "profile ", Snackbar.LENGTH_SHORT)
                        .show()
                    replaceFragment(Fragment_Profile())
                }
            }
            binding.navigationviewmain.menu.getItem(1).isChecked = false
            true
        }

        binding.bottonnavigationmain.setOnItemReselectedListener {}

    }

    private fun openwebsite(url: String) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)
    }

    private fun replaceFragment(fragment: Fragment) {
        val transAction = supportFragmentManager.beginTransaction()
        transAction.replace(R.id.framemaincontiner, fragment)
        transAction.commit()
    }

    private fun firstrun() {
        replaceFragment(Fragment_Explore())
        binding.bottonnavigationmain.selectedItemId = R.id.explore
    }

    @Deprecated("Deprecated in Java")
    override fun onBackPressed() {
        super.onBackPressed()
        binding.navigationviewmain.menu.getItem(1).isChecked = false
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.mun_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {

            R.id.exit -> {
                finish()
            }


        }
        return true
    }


}
