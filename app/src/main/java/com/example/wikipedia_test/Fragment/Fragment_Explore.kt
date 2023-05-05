package com.example.wikipedia_test.Fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.wikipedia_test.Adapter.ExploreAdapter
import com.example.wikipedia_test.Adapter.ItemEvent
import com.example.wikipedia_test.Data.ItemPost
import com.example.wikipedia_test.Activity.MainActivity2
import com.example.wikipedia_test.databinding.FragmentExploreBinding

class Fragment_Explore : Fragment() , ItemEvent {
    private lateinit var binding: FragmentExploreBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentExploreBinding.inflate(layoutInflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val data = arrayListOf<ItemPost>(

            ItemPost(
                "https://upload.wikimedia.org/wikipedia/commons/b/b8/Shahin_Najafi_%2810342456946%29.jpg",
                "Shahin Najafi",
                "Iranian musician",
                "Shahin Najafi was born in 1980 in Bandar-e Anzali, Iran. When he was six years old, his father died, and later his brother became a drug addict and also died.[4] He began writing poetry as a teenager and began learning the guitar in the classical and flamenco styles at the age of 18. He then became an underground artist in Iran, performing in both rock and Spanish music styles, working with various bands.[2]\n" +
                        "\n" +
                        "He studied sociology at the University of Gilan and openly expressed his opinions about the university, leading to his getting expelled",
                false,
                "" ,
               " https://en.wikipedia.org/wiki/Shahin_Najafi"
            ),
            ItemPost(
                "https://upload.wikimedia.org/wikipedia/commons/3/30/Hichkas_.jpg",
                "SoroushLashkari",
                "an Iranian rapper",
                "Soroush Lashkari (Persian: سروش لشکری; born 9 May 1985), known professionally as Hichkas (Persian: هیچ\u200Cکس), is an Iranian rapper, singer, and songwriter.[2][3] Credited with popularizing Persian hip hop to the Iranian people and other Persian-speaking countries such as Afghanistan and Tajikistan, Hichkas's national success and acclaimed works are widely regarded as having broken the barriers that were in place by the Islamic regime for the acceptance of rappers in popular music. Hichkas is considered one of the pioneers of Iranian hip hop and is nicknamed Father of Persian Rap by his fans.[4][5] He became a representation of the Iranian underclass and reflected the angst of the young Iranians. He has been influential for many artists of various genres and is often cited as one of the greatest rappers of Iranian hip hop.\n" +
                        "\n" +
                        "Hichkas is also the founder of the label 021 (alongside Shayan and Yashar) which is considered the first Persian hip hop group. After that, he founded the labels Saamet (alongside RezaPishro and Reveal), and Moltafet (alongside Ali Quf, Ashkan Fadaei, and Dariush and iliyarmeltoo). Hichkas's songs are themed around social and cultural issues in Iran and his lyrical ability and influence pervade the hip hop and rap genre, placing him at the forefront of contemporary Iranian music, inspiring a new generation of Iranian songwriters and artists. Hichkas's first album Jangale Asfalt (Persian: جنگل آسفالت; The Asphalt-paved Jungle) was the first Iranian hip hop album released in 2005.[6] Hichkas's early releases combined traditional Persian instruments and urban beats to create a hybrid genre, a combination of east and west.[7]\n" +
                        "\n" +
                        "In addition to performance, Hichkas's work further spans into art direction, production and artist development, working closely with up and coming artists and providing mentoring and coaching, and consistently being the inspiration behind many Iranian artists in urban arts. He has appeared as guest speaker in many universities including Oxford University,[8] Cambridge University, and Calgary University[9] and discussing Iranian poetry, Iranian underground music scene, and the effect of internet on music publishing in Iran.\n" +
                        "\n" +
                        "Hichkas has collaborated with a number of International hip hop artists including the American hip hop artist Kool G Rap. His highly anticipated second album Mojaz (Persian: مجاز; permissible) was released in March 2020, after 8 years of its initial announcement.[10][11]Soroush Haschim created groups called Moltafet, Samet, 021",
                false,
                "" ,
                "https://en.wikipedia.org/wiki/Hichkas"

            ),
            ItemPost(
                "https://upload.wikimedia.org/wikipedia/commons/5/56/Donald_Trump_official_portrait.jpg",
                "Donald Trump",
                "45th President of the United States",
                "Donald John Trump (born June 14, 1946) is an American politician, media personality, and businessman who served as the 45th president of the United States from 2017 to 2021.\n" +
                        "\n" +
                        "Trump graduated from the Wharton School with a bachelor's degree in 1968. He became president of his father's real estate business in 1971 and renamed it the Trump Organization. He expanded its operations to building and renovating skyscrapers, hotels, casinos, and golf courses and later started side ventures, mostly by licensing his name. From 2004 to 2015, he co-produced and hosted the reality television series The Apprentice. Trump and his businesses have been involved in more than 4,000 state and federal legal actions, including six bankruptcies.\n" +
                        "\n" +
                        "Trump's political positions have been described as populist, protectionist, isolationist, and nationalist. He won the 2016 presidential election as the Republican nominee against Democratic nominee Hillary Clinton despite losing the popular vote.[a] He was the first U.S. president with no prior military or government service. His election and policies sparked numerous protests. The 2017–2019 special counsel investigation established that Russia interfered in the 2016 election to favor the election of Trump. Trump promoted conspiracy theories and made many false and misleading statements during his campaigns and presidency, to a degree unprecedented in American politics. Many of his comments and actions have been characterized as racially charged or racist, and many as misogynistic.\n" +
                        "\n" +
                        "Trump ordered a travel ban on citizens from several Muslim-majority countries, diverted military funding towards building a wall on the U.S.–Mexico border, and implemented a policy of family separations for apprehended migrants. He rolled back more than 100 environmental policies and regulations in an aggressive attempt to weaken environmental protections. Trump signed the Tax Cuts and Jobs Act of 2017, which cut taxes for individuals and businesses and rescinded the individual health insurance mandate penalty of the Affordable Care Act. He appointed 54 federal appellate judges and three U.S. Supreme Court justices. Trump initiated a trade war with China and withdrew the U.S. from the proposed Trans-Pacific Partnership trade agreement, the Paris Agreement on climate change, and the Iran nuclear deal. Trump met with North Korean leader Kim Jong Un three times, but made no progress on denuclearization. He reacted slowly to the COVID-19 pandemic, ignored or contradicted many recommendations from health officials in his messaging, and promoted misinformation about unproven treatments and the need for testing.\n" +
                        "\n" +
                        "Trump lost the 2020 United States presidential election to Joe Biden, but refused to concede defeat, falsely claiming widespread electoral fraud and attempting to overturn the results by pressuring government officials, mounting scores of unsuccessful legal challenges, and obstructing the presidential transition. On January 6, 2021, Trump urged his supporters to march to the U.S. Capitol, which many of them then attacked, resulting in multiple deaths and interrupting the electoral vote count.\n" +
                        "\n" +
                        "Trump is the only American president to have been impeached twice. After he tried to pressure Ukraine in 2019 to investigate Biden, he was impeached in December by the House of Representatives for abuse of power and obstruction of Congress and acquitted by the Senate in February 2020. The House impeached Trump a second time in January 2021, for incitement of insurrection, and the Senate acquitted him in February. In December 2022, the House January 6 Committee recommended criminal charges against Trump for obstructing an official proceeding, conspiracy to defraud the U.S., and inciting or assisting an insurrection. Scholars and historians rank Trump as one of the worst presidents in American history.[1][2]\n" +
                        "\n" +
                        "Since leaving office, Trump has remained heavily involved in the Republican Party. In November 2022, he announced his candidacy for the Republican nomination in the 2024 presidential election. In March 2023, a Manhattan grand jury indicted Trump on 34 felony counts of fraud, making him the first former U.S. president to face criminal charges; he pleaded not guilty to all counts.",
                false,
                ""  ,
                "https://en.wikipedia.org/wiki/Donald_Trump"
            ),
            ItemPost(
                "https://upload.wikimedia.org/wikipedia/en/7/7b/Shrek_%282001_animated_feature_film%29.jpg",
                "Sherek",
                "American computer-animated",
                "Shrek is a 2001 American computer-animated fantasy comedy film loosely based on the 1990 children's picture book of the same name by William Steig. Directed by Andrew Adamson and Vicky Jenson (in their feature directorial debuts) and written by Ted Elliott, Terry Rossio, Joe Stillman, and Roger S. H. Schulman, it is the first installment in the Shrek film series. The film stars Mike Myers, Eddie Murphy, Cameron Diaz, and John Lithgow. In the film, an embittered ogre named Shrek (Myers) finds his home in the swamp overrun by fairy tale creatures banished by the obsessive ruler Lord Farquaad (Lithgow). With the help of Donkey (Murphy), Shrek makes a pact with Farquaad to rescue Princess Fiona (Diaz) in exchange for regaining control of his swamp.\n" +
                        "\n" +
                        "After purchasing rights to Steig's book in 1991, Steven Spielberg sought to produce a traditionally-animated film adaptation, but John H. Williams convinced him to bring the project to the newly founded DreamWorks in 1994. Jeffrey Katzenberg, along with Williams and Aron Warner, began development on Shrek in 1995, immediately following the studio's purchase of the rights from Spielberg. Chris Farley was cast as the voice for the title character, recording most of the required dialogue, but died in 1997 before his work on the film was finished; Myers was hired to replace him, and gave Shrek his Scottish accent. The film was initially intended to be created using motion capture, but after poor test results, the studio hired Pacific Data Images to complete the final computer animation. Shrek parodies other fairy tale adaptations, primarily animated Disney films.[7]\n" +
                        "\n" +
                        "Shrek premiered at the Mann Village Theatre In Westwood, and was later shown at the 2001 Cannes Film Festival, where it competed for the Palme d'Or,[4][8] making it the first animated film since Disney's Peter Pan (1953) to be chosen to do so.[9] The film was theatrically released by DreamWorks Pictures in the United States on May 18, 2001, and grossed over \$491 million worldwide, becoming the fourth highest-grossing film of 2001. It was widely praised by critics for its animation, voice performances, soundtrack, writing and humor, which they noted catered to both adults and children. Shrek was nominated for the Academy Award for Best Adapted Screenplay and won for Best Animated Feature. It earned six nominations at the British Academy of Film and Television Arts (BAFTA), winning for Best Adapted Screenplay.\n" +
                        "\n" +
                        "The film's success helped establish DreamWorks Animation as a competitor to Pixar in feature film computer animation. Three sequels have been released—Shrek 2 (2004), Shrek the Third (2007), and Shrek Forever After (2010)—along with two spin-off films—Puss in Boots (2011) and Puss in Boots: The Last Wish (2022)—and other productions in the Shrek franchise. It is also regarded as one of the most influential animated films of the 2000s. The United States Library of Congress selected Shrek for preservation in the National Film Registry in 2020.[10]",
                false,
                "" ,
                "https://en.wikipedia.org/wiki/Shrek"
            ),
            ItemPost(
                "https://upload.wikimedia.org/wikipedia/commons/b/b6/Reza_Pishro.png",
                "Reza Pishroo",
                "an Iranian rapper",
                "Mohammad Reza Naseri Azad [2] (born on 12 Bahman 1366), who is known by the stage name of Reza Prosor; He is a singer, songwriter, composer and music producer in Persian rap from Iran. [3] He started his non-professional activity in 2001 with the nickname \"Reza 3pac\". The leader has played a role in the establishment of some underground music groups such as Samet. [4] He left Iran in 2016 following his arrest and conviction for illegal artistic activity and continued his artistic activity outside of Iran.",
                false,
                "" ,
                "https://fa.wikipedia.org/wiki/%D8%B1%D8%B6%D8%A7_%D9%BE%DB%8C%D8%B4%D8%B1%D9%88"
            ),
            ItemPost(
                "https://upload.wikimedia.org/wikipedia/commons/9/9a/Saddam_Hussein_in_1998.png",
                "Saddam Hussein",
                "Iraqian dictator",
                "Saddam Hussein[c] (28 April 1937– 30 December 2006) was an Iraqi politician and revolutionary who was the fifth president of Iraq, from 16 July 1979 until 9 April 2003. He also served as prime minister of Iraq, first from 16 July 1979 until 23 March 1991, and later from 29 May 1994 to 9 April 2003. He was a leading member of the revolutionary Arab Socialist Ba'ath Party, and later, the Baghdad-based Ba'ath Party and its regional organization, the Iraqi Ba'ath Party, which espoused Ba'athism, a mix of Arab nationalism and Arab socialism.\n" +
                        "\n" +
                        "Saddam was born near Tikrit to a prominent Sunni Muslim family. He joined the Arab Socialist Ba'ath Party in 1957, and the Baghdad-based Ba'ath Party, and its regional organization, the Iraqi Ba'ath Party. He played a key role in the 17 July Revolution and was appointed vice president by Ahmed Hassan al-Bakr. Saddam nationalised the Iraq Petroleum Company, diversifying the Iraqi economy. He presided over the Second Iraqi–Kurdish War (1974–1975). Following al-Bakr's resignation in 1979, Saddam formally took power in 1979, although he had already been the de facto head of Iraq for several years. Positions of power in the country were mostly filled with Sunni Arabs, a minority that made up only a fifth of the population.[8]\n" +
                        "\n" +
                        "In September 1980, Saddam abrogated the Algiers Agreement and invaded Iran, marking the start of the Iran–Iraq War (1980–1988), which resulted in a stalemate ceasefire. Later, Saddam accused its ally Kuwait of slant-drilling Iraqi oil fields and occupied Kuwait, initiating the Gulf War (1990–1991). Iraq was defeated by a 39-country coalition led by the United States. The United Nations subsequently placed sanctions against Iraq. He suppressed the 1991 Iraqi uprisings of the Kurds and Shia Muslims, which sought to gain independence or overthrow the government. Afterward, Saddam adopted an anti-American stance and established the Faith Campaign, pursuing an Islamist agenda in Iraq. Saddam's rule was marked by numerous human rights abuses, including an estimated 250,000 arbitrary killings. In 2003, the United States and its allies invaded Iraq, falsely accusing Saddam of developing weapons of mass destruction and of having ties with al-Qaeda. The Ba'ath party was banned and Saddam went into hiding. After his capture on 13 December 2003, the trial of Saddam Hussein took place under the Iraqi Interim Government. On 5 November 2006, Saddam was convicted by an Iraqi court of crimes against humanity related to the 1982 killing of 148 Iraqi Shi'a and sentenced to death by hanging. He was executed on 30 December 2006.\n" +
                        "\n" +
                        "A highly pervasive cult of personality, Saddam is accused of repressive authoritarian government,[9] which several analysts have described as totalitarian,[10] although the applicability of that label has been contested.[11]",
                false,
                "" ,
                "https://en.wikipedia.org/wiki/Saddam_Hussein"
            ),
            ItemPost(
                "https://upload.wikimedia.org/wikipedia/commons/f/f1/Mohsen_Namjoo%2C_New_York_2013.jpg",
                "Mohsen Namjoo",
                "Iranian Musician",
                "Namjoo was born on 4 March 1976 in Torbat-e Jam, a small town of Razavi Khorasan in northeastern Iran. He was raised in the religious city of Mashhad.[1] He started learning classical Persian music when he was 12.[1] At a young age, he started listening to Western music and became interested in musicians like Jim Morrison, Eric Clapton, and Chris de Burgh.[1]\n" +
                        "\n" +
                        "He was admitted to the Tehran University of Art in 1994.",
                false,
                "" ,
                "https://en.wikipedia.org/wiki/Mohsen_Namjoo"
            ),
            ItemPost(
                "https://upload.wikimedia.org/wikipedia/commons/e/e1/Hitler_portrait_crop.jpg",
                "Adolf Hitler",
                "an Austrian-born German politician",
                "Adolf Hitler (German: [ˈadɔlf ˈhɪtlɐ] (listen); 20 April 1889 – 30 April 1945) was an Austrian-born German politician who was the dictator of Germany from 1933 until his suicide in 1945. He rose to power as the leader of the Nazi Party,[a] becoming the chancellor in 1933 and then taking the title of Führer und Reichskanzler in 1934.[b] During his dictatorship, he initiated World War II in Europe by invading Poland on 1 September 1939. He was closely involved in military operations throughout the war and was central to the perpetration of the Holocaust: the genocide of about six million Jews and millions of other victims.\n" +
                        "\n" +
                        "Hitler was born in Braunau am Inn in Austria-Hungary and was raised near Linz. He lived in Vienna later in the first decade of the 1900s and moved to Germany in 1913. He was decorated during his service in the German Army in World War I. In 1919, he joined the German Workers' Party (DAP), the precursor of the Nazi Party, and was appointed leader of the Nazi Party in 1921. In 1923, he attempted to seize governmental power in a failed coup in Munich and was imprisoned with a sentence of five years. In jail, he dictated the first volume of his autobiography and political manifesto Mein Kampf (\"My Struggle\"). After his early release in 1924, Hitler gained popular support by attacking the Treaty of Versailles and promoting pan-Germanism, anti-Semitism and anti-communism with charismatic oratory and Nazi propaganda. He frequently denounced international capitalism and communism as part of a Jewish conspiracy.\n" +
                        "\n" +
                        "By November 1932, the Nazi Party held the most seats in the German Reichstag but did not have a majority. As a result, no party was able to form a majority parliamentary coalition in support of a candidate for chancellor. The former chancellor Franz von Papen and other conservative leaders persuaded President Paul von Hindenburg to appoint Hitler as chancellor on 30 January 1933. Shortly after, the Reichstag passed the Enabling Act of 1933 which began the process of transforming the Weimar Republic into Nazi Germany, a one-party dictatorship based on the totalitarian and autocratic ideology of Nazism. On 2 August 1934, Hindenburg died and Hitler replaced him as the head of state and government. Hitler aimed to eliminate Jews from Germany and establish a New Order to counter what he saw as the injustice of the post-World War I international order dominated by Britain and France. His first six years in power resulted in rapid economic recovery from the Great Depression, the abrogation of restrictions imposed on Germany after World War I, and the annexation of territories inhabited by millions of ethnic Germans, which initially gave him significant popular support.\n" +
                        "\n" +
                        "Hitler sought Lebensraum (lit. 'living space') for the German people in Eastern Europe, and his aggressive foreign policy is considered the primary cause of World War II in Europe. He directed large-scale rearmament and, on 1 September 1939, invaded Poland, resulting in Britain and France declaring war on Germany. In June 1941, Hitler ordered an invasion of the Soviet Union. In December 1941, he declared war on the United States. By the end of 1941, German forces and the European Axis powers occupied most of Europe and North Africa. These gains were gradually reversed after 1941, and in 1945 the Allied armies defeated the German army. On 29 April 1945, he married his longtime lover, Eva Braun, in the Führerbunker in Berlin. Less than two days later, the couple committed suicide to avoid capture by the Soviet Red Army. Their corpses were burned as Hitler had commanded.\n" +
                        "\n" +
                        "The historian and biographer Ian Kershaw describes Hitler as \"the embodiment of modern political evil\".[4] Under Hitler's leadership and racist ideology, the Nazi regime was responsible for the genocide of about six million Jews and millions of other victims, whom he and his followers deemed Untermenschen (subhumans) or socially undesirable. Hitler and the Nazi regime were also responsible for the killing of an estimated 19.3 million civilians and prisoners of war. In addition, 28.7 million soldiers and civilians died as a result of military action in the European theatre. The number of civilians killed during World War II was unprecedented in warfare, and the casualties constitute the deadliest conflict in history.",
                false,

                "" ,
                "https://en.wikipedia.org/wiki/Adolf_Hitler"
            ),
            ItemPost(
                "https://upload.wikimedia.org/wikipedia/commons/4/43/Stalin_Full_Image.jpg",
                "Joseph Stalin",
                "A Soviet politician",
                "Joseph Vissarionovich Stalin[g] (born Ioseb Besarionis dze Jughashvili;[d] 18 December [O.S. 6 December] 1878[1] – 5 March 1953) was a Soviet politician, political theorist and revolutionary who led the Soviet Union from 1924 until his death in 1953. He held power as General Secretary of the Communist Party of the Soviet Union (1922–1952) and Chairman of the Council of Ministers of the Soviet Union (1941–1953). Initially governing the country as part of a collective leadership, he consolidated power to become a dictator. Ideologically adhering to the Leninist interpretation of Marxism, he formalised these ideas as Marxism–Leninism, while his own policies are called Stalinism.\n" +
                        "\n" +
                        "Born to a poor ethnic Georgian family in the town of Gori in the Tiflis Governorate of the Russian Empire (now part of Georgia), Stalin joined the Marxist Russian Social Democratic Labour Party in 1901. He edited the party's newspaper, Pravda, and raised funds for Vladimir Lenin's Bolshevik faction via robberies, kidnappings and protection rackets. Repeatedly arrested, he underwent several internal exiles to Siberia. After the Bolsheviks seized power in the October Revolution and created a one-party state under the new Communist Party in 1917, Stalin joined its governing Politburo. Serving in the Russian Civil War before overseeing the Soviet Union's establishment in 1922, Stalin assumed leadership over the country following Lenin's death in 1924. Under Stalin, socialism in one country became a central tenet of the party's ideology. As a result of his Five-Year Plans, the country underwent agricultural collectivisation and rapid industrialisation, creating a centralised command economy. Severe disruptions to food production contributed to the famine of 1930–1933 that killed millions. To eradicate \"enemies of the working class\", Stalin instituted the Great Purge, in which over a million were imprisoned, largely in the Gulag system of forced labour camps, and at least 700,000 executed by government agents between 1936 and 1938.\n" +
                        "\n" +
                        "Stalin promoted Marxism–Leninism abroad through the Communist International and supported European anti-fascist movements during the 1930s, particularly in the Spanish Civil War. In 1939, his regime signed a non-aggression pact with Nazi Germany, resulting in the Soviet invasion of Poland. Germany ended the pact by invading the Soviet Union in 1941, after which Stalin joined the Allies of World War II as one of the Big Three. Despite initial catastrophes, the Soviet Red Army repelled the German invasion and captured Berlin in 1945, ending World War II in Europe. Amid the war, the Soviets annexed the Baltic states and Bessarabia and North Bukovina, subsequently establishing Soviet-aligned governments throughout Central and Eastern Europe and in parts of East Asia. The Soviet Union and the United States emerged as global superpowers and entered a period of tension, the Cold War. Stalin presided over the Soviet post-war reconstruction and its development of an atomic bomb in 1949. During these years, the country experienced another major famine and an antisemitic campaign that culminated in the doctors' plot. After Stalin's death in 1953, he was eventually succeeded by Nikita Khrushchev, who subsequently denounced his rule and initiated the de-Stalinisation of Soviet society.\n" +
                        "\n" +
                        "Widely considered to be one of the 20th century's most significant figures, Stalin was the subject of a pervasive personality cult within the international Marxist–Leninist movement, which revered him as a champion of the working class and socialism. Since the dissolution of the Soviet Union in 1991, Stalin has retained popularity in Russia and Georgia as a victorious wartime leader who cemented the Soviet Union's status as a leading world power. Nevertheless, his regime has been widely criticized as totalitarian and is condemned for overseeing mass repression, ethnic cleansing, wide-scale deportation, hundreds of thousands of executions, and famines that killed millions.",
                false,
                "" ,
                "https://en.wikipedia.org/wiki/Joseph_Stalin"
            ),
            ItemPost(
                "https://upload.wikimedia.org/wikipedia/commons/1/17/Vladimir_Lenin.jpg",
                "Vladimir Lenin",
                "a Russian revolutionary",
                "Vladimir Ilyich Ulyanov[b] (22 April [O.S. 10 April] 1870 – 21 January 1924), better known as Vladimir Lenin,[c] was a Russian revolutionary, politician, and political theorist. He served as the first and founding head of government of Soviet Russia from 1917 to 1924 and of the Soviet Union from 1922 to 1924. Under his administration, Russia, and later the Soviet Union, became a one-party socialist state governed by the Communist Party. Ideologically a Marxist, his development of the ideology is known as Leninism.\n" +
                        "\n" +
                        "Born to an upper-middle-class family in Simbirsk, Lenin embraced revolutionary socialist politics following his brother's 1887 execution. Expelled from Kazan Imperial University for participating in protests against the Russian Empire's Tsarist government, he devoted the following years to a law degree. He moved to Saint Petersburg in 1893 and became a senior Marxist activist. In 1897, he was arrested for sedition and exiled to Shushenskoye in Siberia for three years, where he married Nadezhda Krupskaya. After his exile, he moved to Western Europe, where he became a prominent theorist in the Marxist Russian Social Democratic Labour Party (RSDLP). In 1903, he took a key role in the RSDLP ideological split, leading the Bolshevik faction against Julius Martov's Mensheviks. Following Russia's failed Revolution of 1905, he campaigned for the First World War to be transformed into a Europe-wide proletarian revolution, which, as a Marxist, he believed would cause the overthrow of capitalism and its replacement with socialism. After the 1917 February Revolution ousted the Tsar and established a Provisional Government, he returned to Russia to play a leading role in the October Revolution in which the Bolsheviks overthrew the new regime.\n" +
                        "\n" +
                        "Lenin's Bolshevik government initially shared power with the Left Socialist Revolutionaries, elected soviets, and a multi-party Constituent Assembly, although by 1918 it had centralised power in the new Communist Party. Lenin's administration redistributed land among the peasantry and nationalised banks and large-scale industry. It withdrew from the First World War by signing a treaty conceding territory to the Central Powers, and promoted world revolution through the Communist International. Opponents were suppressed in the Red Terror, a violent campaign administered by the state security services; tens of thousands were killed or interned in concentration camps. His administration defeated right and left-wing anti-Bolshevik armies in the Russian Civil War from 1917 to 1922 and oversaw the Polish–Soviet War of 1919–1921. Responding to wartime devastation, famine, and popular uprisings, in 1921 Lenin encouraged economic growth through the New Economic Policy. Several non-Russian nations had secured independence from the Russian Republic after 1917, but five were forcibly re-united into the new Soviet Union in 1922, while others repelled Soviet invasions. His health failing, Lenin died in Gorki, with Joseph Stalin succeeding him as the pre-eminent figure in the Soviet government.\n" +
                        "\n" +
                        "Widely considered one of the most significant and influential figures of the 20th century, Lenin was the posthumous subject of a pervasive personality cult within the Soviet Union until its dissolution in 1991. He became an ideological figurehead behind Marxism–Leninism and a prominent influence over the international communist movement. A controversial and highly divisive historical figure, Lenin is viewed by his supporters as a champion of socialism and the working class. Meanwhile, Lenin's critics accuse him of establishing a totalitarian dictatorship which oversaw mass killings and political repression.",
                false,
                "" ,
                "https://en.wikipedia.org/wiki/Vladimir_Lenin"
            ),
            ItemPost(
                "https://upload.wikimedia.org/wikipedia/commons/5/58/CheHigh.jpg",
                "Che Guevara",
                "an Argentine Marxist revolutionary",
                "Ernesto \"Che\" Guevara (Spanish: [ˈtʃe ɣeˈβaɾa];[3] 14 June 1928[4] – 9 October 1967) was an Argentine Marxist revolutionary. A major figure of the Cuban Revolution, his stylized visage has become a ubiquitous countercultural symbol of rebellion and global insignia in popular culture.[5]\n" +
                        "\n" +
                        "As a young medical student, Guevara traveled throughout South America and was radicalized by the poverty, hunger, and disease he witnessed.[6][7] His burgeoning desire to help overturn what he saw as the capitalist exploitation of Latin America by the United States prompted his involvement in Guatemala's social reforms under President Jacobo Árbenz, whose eventual CIA-assisted overthrow at the behest of the United Fruit Company solidified Guevara's political ideology.[6] Later in Mexico City, Guevara met Raúl and Fidel Castro, joined their 26th of July Movement, and sailed to Cuba aboard the yacht Granma with the intention of overthrowing U.S.-backed Cuban dictator Fulgencio Batista.[8] Guevara soon rose to prominence among the insurgents, was promoted to second-in-command, and played a pivotal role in the two-year guerrilla campaign that deposed the Batista regime.[9]\n" +
                        "\n" +
                        "After the Cuban Revolution, Guevara played key roles in the new government. These included reviewing the appeals and firing squads for those convicted as war criminals during the revolutionary tribunals,[10] instituting agrarian land reform as Minister of Industries, helping spearhead a successful nationwide literacy campaign, serving as both President of the National Bank and instructional director for Cuba's armed forces, and traversing the globe as a diplomat on behalf of Cuban socialism. Such positions also allowed him to play a central role in training the militia forces who repelled the Bay of Pigs Invasion,[11] and bringing Soviet nuclear-armed ballistic missiles to Cuba, which preceded the 1962 Cuban Missile Crisis.[12] Additionally, Guevara was a prolific writer and diarist, composing a seminal guerrilla warfare manual, along with a best-selling memoir about his youthful continental motorcycle journey. His experiences and studying of Marxism–Leninism led him to posit that the Third World's underdevelopment and dependence was an intrinsic result of imperialism, neocolonialism, and monopoly capitalism, with the only remedies being proletarian internationalism and world revolution.[13][14] Guevara left Cuba in 1965 to foment continental revolutions across both Africa and South America,[15] first unsuccessfully in Congo-Kinshasa and later in Bolivia, where he was captured by CIA-assisted Bolivian forces and summarily executed.[16]\n" +
                        "\n" +
                        "Guevara remains a controversial historical figure, polarized in the collective imagination in a multitude of biographies, memoirs, essays, documentaries, songs, and films. As a result of his perceived martyrdom, poetic invocations for class struggle, and desire to create the consciousness of a \"new man\" driven by moral rather than material incentives,[17] Guevara has evolved into a quintessential icon of various left-wing movements. In contrast, his critics on the political right accuse him of promoting authoritarianism and endorsing violence against his political opponents. Despite disagreements on his legacy, Time named him one of the 100 most influential people of the 20th century,[18] while an Alberto Korda photograph of him, titled Guerrillero Heroico, was cited by the Maryland Institute College of Art as \"the most famous photograph in the world\"",
                false,
                "" ,
                "https://en.wikipedia.org/wiki/Che_Guevara"
            ),
            ItemPost(
                "https://upload.wikimedia.org/wikipedia/en/9/9f/Vforvendettamov.jpg",
                "V for Vendetta (film)",
                "is a dystopian political action film ",
                "V for Vendetta is a 2005 dystopian political action film directed by James McTeigue (in his feature directorial debut) from a screenplay by the Wachowskis.[a] It is based on the 1988 DC Vertigo Comics limited series of the same title by Alan Moore, David Lloyd, and Tony Weare. The film, set in a future where a fascist totalitarian regime has subjugated the UK, centres on V (portrayed by Hugo Weaving), an anarchist and masked freedom-fighter who attempts to ignite a revolution through elaborate terrorist acts, and on Evey Hammond (portrayed by Natalie Portman) a young woman caught up in V's mission. Stephen Rea portrays a detective leading a desperate quest to stop V.\n" +
                        "\n" +
                        "Produced by Silver Pictures, Virtual Studios and Anarchos Productions, Inc., V for Vendetta was originally scheduled for release by Warner Bros. Pictures on 4 November 2005 (a day before the 400th Guy Fawkes Night), but was delayed; it instead opened in the United States on 17 March 2006 to mostly positive reviews from critics and became a box-office success. Alan Moore, dissatisfied with the film adaptations of his other works, From Hell (2001) and The League of Extraordinary Gentlemen (2003), declined to watch the film and asked to not be credited or paid royalties.\n" +
                        "\n" +
                        "Some political groups have seen V for Vendetta as an allegory of oppression by government; anarchists have used it to promote their beliefs. David Lloyd stated: \"The Guy Fawkes mask has now become a common brand and a convenient placard to use in protest against tyranny—and I'm happy with people using it, it seems quite unique, an icon of popular culture being used this way.",
                false,
                "" ,
                "https://en.wikipedia.org/wiki/V_for_Vendetta_(film)"
            )
        )

        val MyAdapter = ExploreAdapter(data , this)

        binding.recyclerexplore.layoutManager =
            LinearLayoutManager(context, RecyclerView.VERTICAL, false)

        binding.recyclerexplore.adapter = MyAdapter

        binding.recyclerexplore.recycledViewPool.setMaxRecycledViews(0 , 0)

    }

    override fun onItemclicek(ItemPost: ItemPost) {

        val intent = Intent(activity , MainActivity2 ::class.java)
        intent.putExtra(SEND_DATA_TO_SECOND_DITAIL_ACTIVITY , ItemPost)
        startActivity(intent)

    }
}