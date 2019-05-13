package com.jdbc.connection;
import java.io.*;
import java.net.*;
import java.nio.charset.Charset;
import java.util.Iterator;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.google.gson.*;

public class AddLegends {

        

		private static String readAll(Reader rd) throws IOException {

        BufferedReader reader = new BufferedReader(rd);
       
        StringBuilder sb = new StringBuilder();
        String line = null;
        while ((line = reader.readLine()) != null) {
            sb.append(line);
        }
        return sb.toString();
    }

    private static JsonElement getAtPath(JsonElement e, String path) throws IOException {
        JsonElement current = e;
        String ss[] = path.split("/");
        for (int i = 0; i < ss.length; i++) {
        	
            current = current.getAsJsonObject().get(ss[i]);
        }
        
        return current;
    }

    public  void Add_upload_Legend(String legendName) {
        InputStream is = null;
        InputStream is1 = null;
        String legend=legendName;
        JavaBeautifier Beautify=new JavaBeautifier();
        FolderCopy dirCopy=new FolderCopy();
        File dir1 = new File("C:\\Users\\Deepak\\Legends");
    	File dir2 = new File("C:\\Users\\Deepak\\Legends1");
    	  Compare Comp=new Compare(); 
    	  
        dirCopy.copyFolder(dir1, dir2);
        
        for (File file: dir1.listFiles()) if (!file.isDirectory()) file.delete();
       // String[] thisIsAStringArray = {"Richard_Lower_(physician)","Roland_Hetzer", "Zbigniew_Religa", "Norman_Shumway", "Michael_Ellis_DeBakey", "Adrian_Kantrowitz", "Arimantas_Dumius", "Denton_Cooley", "Larry_Bucshon", "Rudolf_Zenker", "Bruno_Reichart", "Reiner_KÃ¶rfer", "Dietrich_Birnbaum", "Julius_Kraft-Kinz", "RenÃ©_Favaloro", "Felix_Unger", "Alain_Carpentier", "Richard_Lower", "RenÃ©_PrÃªtre", "John_W._Kirklin", "Veerapandiya_Kattabommu", "Tantia_Tope", "Madan_Lal_Dhingra", "Mangal_Pandey", "Ashfaqulla_Khan", "Udham_Singh", "Khudiram_Bose", "Shivaram_Rajguru", "Sukhdev_Thapar", "Ram_Prasad_Bismil", "Dheeran_Chinnamalai", "Indira_Gandhi", "Rajiv_Gandhi", "Manmohan_Singh", "Morarji_Desai", "Lal_Bahadur_Shastri", "I._K._Gujral", "P._V._Narasimha_Rao", "V._P._Singh", "Gulzarilal_Nanda", "Charan_Singh", "Chandra_Shekhar", "H._D._Deve_Gowda", "Salvador_Allende", "Mikhail_Bulgakov", "Carl_Linnaeus", "Luigi_Galvani_Galvanini_Galvanono", "Dana_Scully", "Bernard_Katz", "Moncef_Marzouki", "Francis_Marrash", "Gilles_de_Corbeil", "Che_Guevara", "Julien_Offray_de_La_Mettrie", "Ruth_Arnon", "Maud_Menten", "Avicenna", "Sun_Yat-sen", "Galen", "TabarÃ©_VÃ¡zquez", "Avempace", "Ludwik_Lejzer_Zamenhof", "Pratibha_Patil", "Pranab_Mukherjee", "Zakir_Hussain", "Sarvepalli_Radhakrishnan", "K._R._Narayanan", "R._Venkataraman", "V._V._Giri", "Fakhruddin_Ali_Ahmed", "Shankar_Dayal_Sharma", "Zail_Singh", "Neelam_Sanjiva_Reddy", "Ram_Nath_Kovind", "Barack_Obama", "George_W._Bush", "Bill_Clinton", "Franklin_Delano_Roosevelt", "Andrew_Johnson", "Gerald_Ford", "Richard_Nixon", "Lyndon_B._Johnson", "John_F._Kennedy", "Dwight_D._Eisenhower", "Harry_S._Truman", "John_Adams", "Thomas_Jefferson", "James_Madison", "James_Monroe", "John_Quincy_Adams", "Andrew_Jackson", "Martin_Van_Buren", "William_Henry_Harrison", "John_Tyler", "James_K._Polk", "Zachary_Taylor", "Millard_Fillmore", "Franklin_Pierce", "James_Buchanan", "George_H._W._Bush", "Jimmy_Carter", "Theodore_Roosevelt", "Woodrow_Wilson", "James_A._Garfield", "Ulysses_S._Grant", "William_McKinley", "Grover_Cleveland", "Herbert_Hoover", "Warren_G._Harding","Luigi_Galvani", "Reiner_K%C3%B6rfer", "Ren%C3%A9_Favaloro", "Tabar%C3%A9_V%C3%A1zque", "Warren_G._Harding", "Bruno_Reichart", "Dietrich_Birnbaum","Thiruvalluvar","Jack_Ma", "Chaleo_Yoovidhya", "Gayatri_Devi", "M._S._Subbulakshmi", "Tyagaraja", "Peter_Dinklage", "Alexander_III_of_Macedon", "Sunder_Pichai", "Satya_Nadella", "Thomas_Kurian", "Sanjay_Jha", "Nikesh_Arora", "Francisco_D%27Souza", "Dinesh_Paliwal", "Sanjay_Mehrotra", "George_Kurian", "Shantanu_Narayen", "Vinod_Dham", "Vinod_Khosla", "Indra_Nooyi", "Ajaypal_Singh_Banga", "Ivan_Menezes", "Rakesh_Kapoor", "LN_Mittal", "Savji_Dholakia","Don_Bradman","Sachin_Tendulkar", "Roger_Federer", "Anil_Kumble", "Lance_Armstrong", "David_Beckham", "Major_Dhyan_Chand", "Donald_Bradman", "Kapil_Dev", "Michael_Jeffrey_Jordan", "Michael_Phelps", "Michael_Schumacher", "Muhammad_Ali", "Roberto_Carlos", "Ronaldo_Luís_Nazário_de_Lima", "Tiger_Woods", "Usain_Bolt", "Viswanathan_Anand", "Viv_Richards", "Zinedine_Zidane", "Pete_Sampras", "Bobby_Charlton", "Diego_Armando_Maradona","Steven_Paul", "Bill_Gates", "Ratan_Tata", "Henry_Ford","Christian_Barnard", "Alexander_Fleming", "Clara_Barton", "Hippocrates", "James_Dewey_Watson", "Elizabeth_Blackwell", "Colin_Murdoch", "Howard_Walter_Florey", "Georgios_Papanikolaou", "Edward_Jenner","Albert_Einstein", "Kalpana_Chawla", "Isaac_Newton", "Abdul_Kalam", "Alessandro_Volta", "Dennis_Ritchie", "Enrico_Fermi", "Michael_Faraday", "Neil_Alden_Armstrong", "Marie_curie", "Alexander_Graham_Bell", "Benjamin_Franklin", "Niels_Bohr", "Christopher_Columbus", "Nicolaus_Copernicus", "Thomas_Alva_Edison", "Galileo_Galilei", "Stephen_Hawking", "Robert_Koch", "Guglielmo_Marconi", "Louis_Pasteur", "James_Watt", "Wright_Brothers","Anna_Hazare", "Mother_Teresa", "Mahatma_Gandhi", "Karl_Marx", "Mary_Wollstonecraft", "Vladimir_Lenin", "Florence_Nightingale", "Betty_Friedan", "Elizabeth_Cady_Stanton", "Jane_Addams", "John_C_Calhoun", "Margaret_Mead", "Pope_John_Paul_II", "Susan_b_anthony","Bhagat_Singh", "Subhash_Chandra_Bose", "Bal_Gangadhar_Tilak", "Chandra_Shekhar_Azad", "Lala_Lajpat_Rai","Charles_Spencer", "Dev_Anand", "Leonardo_Da_Vinci", "Ludwig_van_Beethoven", "Louis_Armstrong", "Walter_Elias_Disney", "Leo_Tolstoy", "Amitabh_Bachhan", "Arnold_Alois_Schwarzenegger", "Sir_Edmund_Percival_Hillary", "Stephen_Collins_Foster", "Michael_Joseph_Jackson", "Noah_Webster", "John_Adams", "William_Shakespeare", "Oprah_Winfrey","Atal_Bihari_Vajpayee", "Abraham_Lincoln", "Adolf_Hitler", "Charles_DeGaulle", "George_Washington", "Jawaharlal_Nehru", "Manmohan_singh", "Margaret_Thatcher", "Martin_Luther_King_Jr", "Mikhail_Gorbachev", "Nelson_Mandela", "Aung_San_Suu_Kyi", "Ronald_Reagan", "Queen_Elizabeth_II", "Sir_Winston_Churchill", "Thomas_Jefferson", "Vladimir_Lenin", "Augustus_Caesar", "Dalai_Lama","J._K._Rowling", "Daniel Ek","Sir_George_Abraham_Grierson_", "Ramchandra_Shukla", "Raja_Ram_Mohan_Roy", "Aristotle", "Plato", "Immanuel_Kant", "Socrates", "Rene_Descartes", "Friedrich_Nietzsche", "Jean-Paul_Sarte", "Ludwig_WittgensteinThomas_Acquinas", "John_Locke", "Jean-Jacques_Rousseau", "Søren_Kierkegaard", "David_Hume", "Bertrand_Russell", "Confucius", "Thomas_Hobbes", "Epicurus", "Augustine_of_Hippo", "Mary_Barra", "Marc_Benioff", "Jeff_Bezos","Adam_Silver", "Amancio_Ortega_Gaona", "Andrew_Carnegie", "Arianna_Huffington", "Benjamin_Franklin", "Bills_Simmons", "Brian_Chesky", "Carlos_Rodriguez", "Carlos_Slim", "Charlie_Munger", "Dan_Schulman_", "DaNiel_EK", "Elon_Musk", "Gary_Kelly", "Gary_Vaynerchuk", "Grant_Cardone", "Hans_Christian_Anderson", "Jack_Dorsey", "Jay_Z", "Jeff_Weiner", "Jerry_Yang", "Jhon_Mackey", "Jimmy_Choo", "John_D._Rockefeller", "Kevin_Plank", "Larry_Page", "Lisa_Falzone", "Lynn_Jurich", "Madam_C_J_Walker", "Marillyn_Hewson", "Mark_Cuban", "Mark_Parker", "Mark_Zuckerberg", "Meg_Whitman", "Melinda_Gates", "Oprah_Winfrey", "Reed_Hastings", "Ryan_Hoover", "Sean_Combs", "Sergey_Brin", "Sherly_Sandberg", "Stewart_Buttefeild", "Tim_Cook", "Tony_Hsieh", "Travis_Kalanick", "Vera_Wang", "Walt_Disney", "Warren_A._Bechtel", "Warren_Buffett","Viswanathan_Anand", "Gagan_Narang", "Leander_Paes", "Abhinav_Bindra", "Mary_Kom", "Sushil_Kumar", "Saina_Nehwal", "Anju_Bobby_George", "Karanam_Malleswari", "Mahendra_Singh_Dhoni", "Vijender_Singh", "Kunjarani_Devi", "Vijay_Kumar", "Rajyavardhan_Singh_Rathore", "Yogeshwar_Dutt", "Pankaj_Advani", "Pullela_Gopichand", "Geet_Sethi", "Dhanraj_Pillay", "Ronjan_Sodhi", "Manavjit_Singh_Sandhu", "Anjali_Bhagwat", "Jyotirmoyee_Sikdar", "Devendra_Jhajharia", "Homi_Motivala", "K._M._Beenamol", "Pushpendra_Kumar_Garg", "Sardara_Singh", "Ada_Yonath", "Alice_Munro", "Alva_Myrdal", "Barbara_McClintock", "Bertha_von_Suttner", "Carol_W._Greider", "Christiane_Nüsslein-Volhard", "Doris_Lessing", "Dorothy_Hodgkin", "Elfriede_Jelinek", "Elinor_Ostrom", "Elizabeth_Blackburn", "Ellen_Johnson_Sirleaf", "Emily_Greene_Balch", "Françoise_Barré-Sinoussi", "Gabriela_Mistral", "Gertrude_B._Elion", "Gerty_Cori", "Grazia_Deledda", "Herta_Müller", "Irène_Joliot-Curie", "Jody_Williams", "Leymah_Gbowee", "Linda_B._Buck", "_Marie_Sklodowska_Curie_", "Mairead_Maguire", "Malala_Yousafzai", "Maria_Goeppert-Mayer", "May-Britt_Moser", "Nadine_Gordimer", "Nelly_Sachs", "Pearl_S._Buck", "Rigoberta_Menchú", "Rita_Levi-Montalcini", "Rosalyn_Sussman_Yalow", "_Selma_Lagerlöf_", "Selma_Lagerlöf", "Shirin_Ebadi", "Sigrid_Undset", "Svetlana_Alexievich", "Tawakkol_Karman", "Toni_Morrison", "Tu_Youyou", "Wangari_Maathai", "Wislawa_Szymborska", "Paul_Scofield", "Casey_Affleck", "Rod_Steiger", "Peter_Finch", "Lionel_Barrymore", "Warner_Baxter","Wallace_Beery", "Victor_McLaglen", "Tom_Hanks", "Humphrey_Bogart", "Henry_Fonda", "Roberto_Benigni", "Kevin_Spacey", "Eddie_Redmayne", "Marlon_Brando", "Robert_De_Niro", "Leonardo_DiCaprio", "Jack_Nicholson", "John_Wayne", "Al_Pacino", "Paul_Newman", "Denzel_Washington", "Nicolas_Cage", "Dustin_Hoffman", "Sean_Penn", "Laurence_Olivier", "Charles_Laughton", "Anthony_Hopkins", "Clark_Gable", "Spencer_Tracy", "Bing_Crosby", "Lee_Marvin", "Emil_Jannings", "Charlton_Heston", "Gary_Cooper", "James_Cagney", "Jack_Lemmon", "William_Holden", "James_Stewart", "Ernest_Borgnine", "Yul_Brynner", "Alec_Guinness", "Sidney_Poitier", "Adrien_Brody", "William_Hurt", "Gregory_Peck", "Robert_Donat", "Michael_Douglas", "Russell_Crowe", "Gene_Hackman", "Maximilian_Schell", "Burt_Lancaster", "Colin_Firth", "Geoffrey_Rush", "Daniel_Day-Lewis", "Jon_Voight", "Robert_Duvall", "Jeremy_Irons", "Jamie_Foxx", "Ben_Kingsley", "Jeff_Bridges", "Philip_Seymour_Hoffman", "Ray_Milland", "Ronald_Colman", "Richard_Dreyfuss", "Fredric_March", "Rex_Harrison", "Cliff_Robertson", "David_Niven", "F._Murray_Abraham", "Paul_Lukas", "George_Arliss", "Paul_Muni", "Broderick_Crawford", "Art_Carney", "George_C._Scott", "Forest_Whitaker", "Matthew_McConaughey", "Jean_Dujardin", "Helen_Mirren", "Kathy_Bates", "Halle_Berry", "Joanne_Woodward", "Meryl_Streep", "Grace_Kelly", "Barbra_Streisand", "Marion_Cotillard", "Cher", "Liza_Minnelli", "Luise_Rainer", "Brie_Larson", "Gwyneth_Paltrow", "Elizabeth_Taylor", "Nicole_Kidman", "Natalie_Portman", "Joan_Crawford", "Julia_Roberts", "Sandra_Bullock", "Jane_Fonda", "Jodie_Foster", "Audrey_Hepburn", "Ingrid_Bergman", "Sophia_Loren", "Reese_Witherspoon", "Anna_Magnani", "Katharine_Hepburn", "Bette_Davis", "Charlize_Theron", "Julianne_Moore", "Cate_Blanchett", "Hilary_Swank", "Norma_Shearer", "Shirley_MacLaine", "Jane_Wyman", "Olivia_de_Havilland", "Joan_Fontaine", "Ginger_Rogers", "Diane_Keaton", "Mary_Pickford", "Holly_Hunter", "Simone_Signoret", "Vivien_Leigh", "Susan_Sarandon", "Emma_Stone", "Julie_Andrews", "Faye_Dunaway", "Emma_Thompson", "Helen_Hunt", "Maggie_Smith", "Jessica_Lange", "Julie_Christie", "Jessica_Tandy", "Louise_Fletcher", "Glenda_Jackson", "Janet_Gaynor", "Greer_Garson", "Anne_Bancroft", "Sally_Field", "Jennifer_Lawrence", "Jennifer_Jones", "Sissy_Spacek", "Patricia_Neal", "Kate_Winslet", "Claudette_Colbert", "Frances_McDormand", "Ellen_Burstyn", "Marlee_Matlin", "Helen_Hayes", "Geraldine_Page", "Susan_Hayward", "Marie_Dressler", "Judy_Holliday", "Shirley_Booth", "Loretta_Young","Chester_A._Arthur", "William_Howard_Taft", "Benjamin_Harrison", "Rutherford_B._Hayes", "Calvin_Coolidge", "Nathan_Petrelli", "David_Palmer", "Matt_Santos", "Charles_Logan", "Josiah_Bartlet", "James_Heller", "Frank_Underwood", "Noah_Daniels"};
       // String[] thisIsAStringArray = {"Viswanathan_Anand", "Gagan_Narang", "Leander_Paes", "Abhinav_Bindra", "Mary_Kom", "Sushil_Kumar", "Saina_Nehwal", "Anju_Bobby_George", "Karanam_Malleswari", "Mahendra_Singh_Dhoni", "Vijender_Singh", "Kunjarani_Devi", "Vijay_Kumar", "Rajyavardhan_Singh_Rathore", "Yogeshwar_Dutt", "Pankaj_Advani", "Pullela_Gopichand", "Geet_Sethi", "Dhanraj_Pillay", "Ronjan_Sodhi", "Manavjit_Singh_Sandhu", "Anjali_Bhagwat", "Jyotirmoyee_Sikdar", "Devendra_Jhajharia", "Homi_Motivala", "K._M._Beenamol", "Pushpendra_Kumar_Garg", "Sardara_Singh", "Ada_Yonath", "Alice_Munro", "Alva_Myrdal", "Barbara_McClintock", "Bertha_von_Suttner", "Carol_W._Greider", "Christiane_Nüsslein-Volhard", "Doris_Lessing", "Dorothy_Hodgkin", "Elfriede_Jelinek", "Elinor_Ostrom", "Elizabeth_Blackburn", "Ellen_Johnson_Sirleaf", "Emily_Greene_Balch", "Françoise_Barré-Sinoussi", "Gabriela_Mistral", "Gertrude_B._Elion", "Gerty_Cori", "Grazia_Deledda", "Herta_Müller", "Irène_Joliot-Curie", "Jody_Williams", "Leymah_Gbowee", "Linda_B._Buck", "_Marie_Sklodowska_Curie_", "Mairead_Maguire", "Malala_Yousafzai", "Maria_Goeppert-Mayer", "May-Britt_Moser", "Nadine_Gordimer", "Nelly_Sachs", "Pearl_S._Buck", "Rigoberta_Menchú", "Rita_Levi-Montalcini", "Rosalyn_Sussman_Yalow", "_Selma_Lagerlöf_", "Selma_Lagerlöf", "Shirin_Ebadi", "Sigrid_Undset", "Svetlana_Alexievich", "Tawakkol_Karman", "Toni_Morrison", "Tu_Youyou", "Wangari_Maathai", "Wislawa_Szymborska", "Paul_Scofield", "Casey_Affleck", "Rod_Steiger", "Peter_Finch", "Lionel_Barrymore", "Warner_Baxter","Wallace_Beery", "Victor_McLaglen", "Tom_Hanks", "Humphrey_Bogart", "Henry_Fonda", "Roberto_Benigni", "Kevin_Spacey", "Eddie_Redmayne", "Marlon_Brando", "Robert_De_Niro", "Leonardo_DiCaprio", "Jack_Nicholson", "John_Wayne", "Al_Pacino", "Paul_Newman", "Denzel_Washington", "Nicolas_Cage", "Dustin_Hoffman", "Sean_Penn", "Laurence_Olivier", "Charles_Laughton", "Anthony_Hopkins", "Clark_Gable", "Spencer_Tracy", "Bing_Crosby", "Lee_Marvin", "Emil_Jannings", "Charlton_Heston", "Gary_Cooper", "James_Cagney", "Jack_Lemmon", "William_Holden", "James_Stewart", "Ernest_Borgnine", "Yul_Brynner", "Alec_Guinness", "Sidney_Poitier", "Adrien_Brody", "William_Hurt", "Gregory_Peck", "Robert_Donat", "Michael_Douglas", "Russell_Crowe", "Gene_Hackman", "Maximilian_Schell", "Burt_Lancaster", "Colin_Firth", "Geoffrey_Rush", "Daniel_Day-Lewis", "Jon_Voight", "Robert_Duvall", "Jeremy_Irons", "Jamie_Foxx", "Ben_Kingsley", "Jeff_Bridges", "Philip_Seymour_Hoffman", "Ray_Milland", "Ronald_Colman", "Richard_Dreyfuss", "Fredric_March", "Rex_Harrison", "Cliff_Robertson", "David_Niven", "F._Murray_Abraham", "Paul_Lukas", "George_Arliss", "Paul_Muni", "Broderick_Crawford", "Art_Carney", "George_C._Scott", "Forest_Whitaker", "Matthew_McConaughey", "Jean_Dujardin", "Helen_Mirren", "Kathy_Bates", "Halle_Berry", "Joanne_Woodward", "Meryl_Streep", "Grace_Kelly", "Barbra_Streisand", "Marion_Cotillard", "Cher", "Liza_Minnelli", "Luise_Rainer", "Brie_Larson", "Gwyneth_Paltrow", "Elizabeth_Taylor", "Nicole_Kidman", "Natalie_Portman", "Joan_Crawford", "Julia_Roberts", "Sandra_Bullock", "Jane_Fonda", "Jodie_Foster", "Audrey_Hepburn", "Ingrid_Bergman", "Sophia_Loren", "Reese_Witherspoon", "Anna_Magnani", "Katharine_Hepburn", "Bette_Davis", "Charlize_Theron", "Julianne_Moore", "Cate_Blanchett", "Hilary_Swank", "Norma_Shearer", "Shirley_MacLaine", "Jane_Wyman", "Olivia_de_Havilland", "Joan_Fontaine", "Ginger_Rogers", "Diane_Keaton", "Mary_Pickford", "Holly_Hunter", "Simone_Signoret", "Vivien_Leigh", "Susan_Sarandon", "Emma_Stone", "Julie_Andrews", "Faye_Dunaway", "Emma_Thompson", "Helen_Hunt", "Maggie_Smith", "Jessica_Lange", "Julie_Christie", "Jessica_Tandy", "Louise_Fletcher", "Glenda_Jackson", "Janet_Gaynor", "Greer_Garson", "Anne_Bancroft", "Sally_Field", "Jennifer_Lawrence", "Jennifer_Jones", "Sissy_Spacek", "Patricia_Neal", "Kate_Winslet", "Claudette_Colbert", "Frances_McDormand", "Ellen_Burstyn", "Marlee_Matlin", "Helen_Hayes", "Geraldine_Page", "Susan_Hayward", "Marie_Dressler", "Judy_Holliday", "Shirley_Booth", "Loretta_Young"};
       
       // String[] thisIsAStringArray = {};
       String[] thisIsAStringArray = {"Bijapur_district,_Karnataka"};
    		   //, "Ambareesh", "Ananth_Nag", "Aishwarya_rai", "Anushka_Shetty", "Arjun_Sarja", "Aarathi_(Kannada_actress)", "Atul_Kulkarni_(actor_born_1965)", "A._T._Raghu", "B._Saroja_Devi", "B._C._Patil", "B._S._Ranga", "B._V._Karanth", "Bala_(actor)", "Balakrishna", "Bharathi_(film)", "Bhavana", "Chandulal_Jain", "Chetan_Kumar", "Comedy_Time_Ganesh", "Darshan_Tugudeep", "Daisy_Bopanna", "Deepika_Padukone", "Devaraj", "Dwarakesh", "Ganesh_Hegde", "G._V._Iyer", "Geetha_(actress)", "Girish_Karnad", "Girish_Kasaravalli", "Gulshan_Devaiah", "Guru_Dutt", "Hansika_Motwani", "Harshika_Poonacha", "Isha_Koppikar", "Jaggesh", "Jayant_Kaikini", "Kalpana_(Kannada_actress)", "Kalyan_Kumar", "Kashinath_(actor)", "Lakshmi_Rai", "Leelavathi_(actress)", "Lokesh", "M._S._Sathyu", "Manjula_(Kannada_actress)", "Master_Manjunath", "Phoonk_2", "Mohan_(actor)", "Nagathihalli_Chandrashekar", "Narasimharaju_(Kannada_actor)", "Nidhi_Subbaiah", "Nishan_K._P._Nanaiah", "Pandari_Bai", "Pattabhirama_Reddy", "Pradeep_Uppoor", "Prakash_Rai", "Prabhu_Deva", "Prema_(actress)", "Puneeth_Rajkumar", "Puttana_Kanagal", "Radhika_Pandit", "Raghavendra_Rajkumar", "Rajanikanth", "Rajesh_Krishnan", "Rajkumar_(actor)", "Raju_Sundaram", "Rakshita", "Ramesh_Arvind", "Divya_Spandana", "V._Ravichandran", "Rockline_Venkatesh", "Rohit_Shetty", "Roopa_Iyer", "Sakshi_Shivanand", "Sanchita_Shetty", "Sandeep_Chowta", "Shamita_Shetty", "Shankar_Nag", "Shashi_Kumar", "Shivarajkumar", "Shilpa_Shetty", "Sneha_Ullal", "Soundarya", "Srimurali", "Srinath", "Sudha_Rani", "Suman_Nagarkar", "Suman_Ranganathan", "Sunil_Shetty", "Sunil_Kumar_Desai", "Sudeep", "T._S._Nagabharana", "Tara_(Kannada_actress)", "Tiger_Prabhakar", "Umashri", "Upendra_(actor)", "Vajramuni", "Vaishali_Desai", "Vasundhara_Das", "Vishnuvardhan_(actor)", "Yashwant_Sardeshpande", "Arundhati_Nag", "B._V._Karanth", "Chandrashekhar_Kambara", "Chindodi_Leela", "Girish_Karnad", "Gubbi_Veeranna", "K._V._Subbanna", "Kalpana_(Kannada_actress)", "Lokesh", "Mukhyamantri_Chandru", "Prasanna", "Shankar_Nag", "Shivananda", "Umashree", "Vajramuni", "Yashwant_Sardeshpande", "Amarashilpi_Jakanachari", "Gundan_Anivaritachari", "Ruvari_Malithamma", "Dattatreya_Aralikatte", "K.K._Raghava", "Renuka_Kesaramadu", "Ashwini_Bhat", "Surekha", "S._G._Vasudev", "Yusuf_Arakkal", "Gopala_Dasa", "Muthiah_Bhagavatar", "Jagannatha_Dasa", "Kadri_Gopalnath", "Jyotsna_Srikanth", "Kanakadasa", "Jayachamaraja_Wodeyar", "Mysore_Manjunath", "Mysore_Sadasiva_Rao", "V._Ramarathnam", "Mysore_Vasudevacharya", "Mysore_brothers", "N._Ravikiran", "Purandaradasa", "R._K._Srikanthan", "R.R._Keshavamurthy", "Sripadaraya", "T._Chowdiah", "Vadiraja", "Vijaya_Dasa", "Vyasatirtha", "Doraiswamy_Iyengar", "Veene_Sheshanna", "Vittal_Ramamurthy", "Ghatam_Udupa", "K._V._Krishna_Prasad", "B._Shankar_Rao", "Anoor_Anantha_Krishna_Sharma", "M._S._Sheela", "Basavaraja_Rajaguru", "Bhimsen_Joshi", "Pandit_S._Ballesh", "Ganapati_Bhat", "Gangubai_Hangal", "Gururao_Deshpande", "Jayateerth_Mevundi", "Kumar_Gandharva", "Lalith_J._Rao", "Madhava_Gudi", "Mallikarjun_Mansur", "Milind_Chittal", "Nachiketa_Sharma", "Nagaraja_Rao_Havaldar", "Pravin_Godkhindi", "Puttaraja_Gawai", "Rajeev_Taranath", "Sanjeev_Chimmalgi", "Sangeetha_Katti", "Sawai_Gandharva", "Shobha_Gurtu", "Smita_Bellur", "Taranath_Rao", "Pandit_Venkatesh_Kumar", "Vinayak_Torvi", "Keshav_Ginde", "Madhav_Gudi", "Ganayogi_Panchakshara_Gawai", "Mysore_Ananthaswamy", "P._Kalinga_Rao", "Pandit_Narasimhalu_Vadavati", "Pandit_S._Ballesh", "Mysore_Manjunath", "Pravin_Godkhindi", "Shimoga_Subbanna", "C._Aswath", "Balappa_Hukkeri", "G.V._Atri", "Ganesh_Hegde", "Biddu_Appaiah", "Anoop_Seelin", "Arjun_Sarja", "B._V._Karanth", "C._Aswath", "G._K._Venkatesh", "G._V._Iyer", "Gurukiran", "Pandit_S._Ballesh", "Hamsalekha", "Jayant_Kaikini", "Mano_Murthy", "Rajan-Nagendra", "V._Ravichandran", "Sadhu_Kokila", "Sagar_S", "Sandeep_Chowta", "Shankar_Ganesh", "V._Harikrishna", "V._Manohar", "Vijaya_Bhaskar", "Raghu_Dixit", "Nanditha", "Rajkumar_(actor)", "Rajesh_Krishnan", "Vijay_Prakash", "Chetan_Sosca", "Maya_Rao", "Deepika_Padukone", "Prasad_Bidapa", "Aliya_Rama_Raya", "Abbakka_Rani", "Amoghavarsha", "Basaveshwara", "Bijjala_II", "Bukka_Raya_I", "Butuga_II", "Chikkadevaraja_Wodeyar", "Chamundaraya", "Chand_Bibi", "Devaraya", "Deva_Raya_II", "Dhruva_Dharavarsha", "Durvinita", "Govinda_III", "Hyder_Ali", "Harihara_I", "Ibrahim_Adil_Shah_II", "Indra_III", "Jayachamaraja_Wodeyar_Bahadur", "Kempe_Gowda", "Krishna_III", "Krishnadeva_Raya", "Krishnaraja_Wodeyar_IV", "Madakari_Nayaka", "Mayuravarma", "Pulakesi_II", "Keladi_Chennamma", "Rani_Chennamma", "Saluva_Narasimha_Deva_Raya", "Sangolli_Rayanna", "Tailapa_II", "Tippu_Sultan", "Veera_Ballala_II", "Veera_Ballala_III", "Vikramaditya_II", "Vikramaditya_VI", "Vishnuvardhana", "A._B._Shetty", "Ammembal_Subba_Rao_Pai", "Arun_Pudur", "G._R._Gopinath", "B._R._Shetty", "Gururaj_Deshpande", "K._V._Kamath", "Kiran_Mazumdar-Shaw", "N._R._Narayana_Murthy", "N_S_Narendra", "Nandan_Nilekani", "Phaneesh_Murthy", "R._N._Shetty", "T._M._A._Pai", "Nithin_Kamath", "V._G._Siddhartha", "Vaman_Srinivas_Kudva", "Vijay_Mallya", "Vijay_Sankeshwar", "Vittal_Mallya", "Pradeep_Kar", "Supreeth_Shankarghal", "Ashok_Kheny", "Thumbay_Moideen", "C._N._R._Rao", "C._R._Rao", "Dr._Murugappa_Channaveerappa_Modi", "Narayan_Hosmane", "Raja_Ramanna", "Roddam_Narasimha", "U._R._Rao", "M.L._Kulkarni", "B._N._Suresh", "S._K._Shivkumar", "K._N._Shankara", "S._G._Balekundri", "Nandan_Nilekani", "Sudha_Murthy", "Vivek_Kulkarni", "Narayan_Hosmane", "Gururaj_Deshpande", "Bhaskaracharya", "D._C._Pavate", "Mahavira_(mathematician)", "Shakuntala_Devi", "Arun_Netravali", "Kumar_Malavalli", "Visvesvaraya", "VKRV_Rao", "Gita_Gopinath", "Amoghavarsha_I", "Asaga", "Ranna", "Janna", "Adikavi_Pampa", "Sri_Ponna", "Shivakotiacharya", "Muddana", "Andayya", "Gangadevi", "Kumaravyasa", "Harihara", "Lakshmisha", "Raghavanka", "Rudrabhatta", "Lord_Basava", "Akka_Mahadevi", "Sarvajna", "Tirumalamba", "Purandaradasa", "Kanakadasa", "Shishunaala_Sharif_Saheba", "Trivikrama_Panditacharya", "Narayana_Panditacharya", "Kumudendu_Muni", "Shishunala_Sharif", "A.N._Krishna_Rao", "Anupama_Niranjana", "B._G._L._Swamy", "B._M._Srikantaiah", "Beechi", "Chandrashekhara_Kambara", "D.R._Bendre", "Javare_Gowda", "Jayalakshmi_Seethapura", "D._V._Gundappa", "G._P._Rajarathnam", "Girish_Karnad", "Gopalakrishna_Adiga", "Gorur_Ramaswamy_Iyengar", "Ha_Ma_Nayak", "K._S._Narasimhaswamy", "K._S._Nissar_Ahmed", "K._Anantharamu", "K._Shivaram_Karanth", "Kuvempu", "M._Govinda_Pai", "Maasti_Venkatesh_Ayengar", "Maya_Kamath", "P._Lankesh", "Panchakshari_Hiremath", "A.K._Ramanujan", "Poornachandra_Tejaswi", "P._T._Narasimhachar", "R._C._Hiremath", "R._K._Narayan", "Raja_Rao", "S._Srikanta_Sastri", "S._L._Bhyrappa", "S._R._Ramaswamy", "Shatavadhani_Ganesh", "Shashi_Deshpande", "T._P._Kailasam", "T._R._Subba_Rao", "T._N._Srikantaiah", "U._R._Ananthamurthy", "V._K._Gokak", "Yashwant_Chittal", "Ferdinand_Kittel", "Dinakara_Desai", "Narayanacharya", "Galaganatha", "K.C._Reddy", "Kadidal_Manjappa", "Kengal_Hanumanthaiah", "Shantaveri_Gopala_Gowda", "S._Nijalingappa", "Devaraj_Urs", "Kamaladevi_Chattopadhyaya", "Basappa_Danappa_Jatti", "Gudleppa_Hallikeri", "M.N._Jois", "Bantwal_Vaikunta_Baliga", "Gundu_Rao", "Ramakrishna_Hegde", "Sudheendra_Kulkarni", "Prabhakar_Kore", "S.R.Kanti", "Neeraj_Patil", "S.R.Bommai", "Veerendra_Patil", "S.Bangarappa", "Veerappa_Moily", "H.D._Deve_Gowda", "J.H.Patel", "George_Fernandes", "S.M._Krishna", "Dharam_Singh", "H.D.Kumaraswamy", "B.S.Yediyurappa", "D.V._Sadananda_Gowda", "Jagadish_Shettar", "Siddaramaiah", "Ramesh_Jigajinagi", "M.P._Prakash", "Oscar_Fernandes", "Jaffer_Sharief", "Margaret_Alva", "U._Srinivas_Mallya", "H.N.Ananth_Kumar", "Mallikarjun_Kharge", "K.H._Muniyappa", "V.S.Acharya", "H.Vishwanath", "Vatal_Nagaraj", "Vishweshwara_Hegde", "C_B_Muthamma", "C._G._Somiah", "Shankar_Bidari", "Abdul_Rahman_Infant", "Dr.M.H.Marigowda", "H._T._Sangliana", "Daya_Nayak", "Kempaiah", "S._K._Amin", "Sarvajna", "Sree_Sree_Shivakumara_Swamiji", "Kanaka_Dasa", "Basavanna", "Purandara_Dasa", "Vidyaranya", "Allama_Prabhu", "Madhvacharya", "Mangesh_V._Nadkarni", "Raghavendra_Swami", "Akka_Mahadevi", "Jayatirtha", "Sripadaraya", "Vyasatirtha", "Vadirajatirtha", "Naraharitirtha", "Padmanabha_Tirtha", "Raghaveshwara_Bharathi", "Gangadharendra_Saraswati", "Balagangadharanatha_Swamiji", "Shivamurthy_Shivacharya_Mahaswamiji", "Jaggi_Vasudev", "Siddharudha_Swami", "Narayan_Maharaj", "Dattatreya#Travels", "Kaadsiddheshwar", "Keshavashram", "Tirumalai_Krishnamacharya", "B.K.S._Iyengar", "Geeta_Iyengar", "Jaggi_Vasudev", "Malladihalli_Sri_Raghavendra_Swamiji", "Pattabhi_Jois", "Hanumappa_Sudarshan", "Ullas_Karanth", "Krupakar-Senani", "Vandana_Shiva", "S.R._Rao", "Dr._B.A._Saletore", "P._B._Desai", "P._Gururaja_Bhat", "G._S._Gai", "A._N._Narasimhia", "B._L._Rice", "Sree_Sree_Shivakumara_Swamiji", "S._K._Amin", "Malladihalli_Sri_Raghavendra_Swamiji", "Sudha_Murthy", "Tulsi_Gowda", "Veerendra_Heggade", "Saalumarada_Thimmakka", "Vijay_Bhardwaj", "Raghuram_Bhat", "Roger_Binny", "Stuart_Binny", "Bhagwat_Chandrasekhar", "Deepak_Chougule", "Rahul_Dravid", "Doddanarasaiah_Ganesh", "David_Johnson_(cricketer,_born_1971)", "Sunil_Joshi", "Syed_Kirmani", "Vinay_Kumar", "Anil_Kumble", "Sanjay_Manjrekar", "Abhimanyu_Mithun", "Manju_Nadgoda", "Manish_Pandey", "Brijesh_Patel", "Venkatesh_Prasad", "E.A.S._Prasanna", "KL_Rahul", "A._Ramakrishnappa", "Shantha_Rangaswamy", "Barrington_Rowland", "Ganesh_Satish", "Sujith_Somasunder", "Javagal_Srinath", "Robin_Uthappa", "Gundappa_Vishwanath", "Sadanand_Viswanath", "B._P._Govinda", "M._P._Ganesh", "Ashish_Ballal", "Arjun_Halappa", "Sommayya_Maneypande", "Ashwini_Nachappa", "J._J._Shobha", "Vandana_Rao", "Vandana_Shanbagh", "Vikas_Gowda", "Girisha_Nagarajegowda", "Prakash_Padukone", "Anup_Sridhar", "Ashwini_Ponnappa", "Mahesh_Bhupathi", "Rohan_Bopanna", "Poojashree_Venkatesh", "Srinath_Prahlad", "C.C._Machaiah", "Chetan_Baboor", "Nisha_Millet", "Pankaj_Advani", "Malathi_Krishnamurthy_Holla", "Ajjamada_B_Devaiah", "Kodandera_Madappa_Cariappa", "Ramesh_Halagali", "Major_M_C_Muthanna", "Chief_Justice_of_India", "Sir_M._Visvesvaraya", "Bhimsen_Joshi", "C.N.R._Rao", "Kuvempu", "D._R._Bendre", "K._Shivaram_Karanth", "Masti_Venkatesha_Iyengar", "V._K._Gokak", "U._R._Ananthamurthy", "Girish_Karnad", "Chandrashekhara_Kambara", "S._L._Bhyrappa", "Shakuntala_Devi", "Naa_Someswara", "G._S._Paramasivaiah", "K_B_Ganapathy", "Aluru_Venkata_Rao", "Huilgol_Narayana_Rao", "Ravi_Belagere", "Mayurasharma", "Pulakesi_I", "Krishna_Deva_Raya", "Kumara_Rama", "Somesvara_I", "Belawadi_Mallamma", "Kittur_Chennamma", "Attimabbe", "Gajendragarh#Vedanta.2C_Nyaya.2C_Vyakaran", "Pandita_Ramabai", "Saraswati_Gangadhar", "Shivram_Dattatreya_Phadnis", "A.N.Prahlada_Rao", "List_of_Indian_poets#Kannada", "List_of_people_from_Bangalore", "Kannadigas", "Tuluva", "Kodava_people", "Konkani_people", "Lists_of_Indians_by_state", "Aihole", "Alupa_dynasty", "Amoghavarsha", "Badami", "Banavasi", "Balligavi", "Belur", "Chalukya_dynasty", "Nayakas_of_Chitradurga", "Deva_Raya_II", "Durvinita", "Halebidu_(town)", "Haleri_Kingdom", "Halmidi", "Hampi", "Hoysala_Empire", "Kadamba_dynasty", "Western_Chalukya_Empire", "Nayakas_of_Keladi", "Shivappa_Nayaka", "Kittur_Chennamma", "Kingdom_of_Mysore", "Mayurasharma", "Pattadakal", "Pulakeshin_II", "Rashtrakuta_dynasty", "Sringeri", "Srirangapatna", "Tipu_Sultan", "Unification_of_Karnataka", "Vijayanagara_Empire", "Vijayanagara", "Vishnuvardhana", "Veera_Ballala_II", "Vikramaditya_II", "Vikramaditya_VI", "Western_Ganga_dynasty", "Category:Cities_and_towns_in_Karnataka", "List_of_districts_of_Karnataka", "Category:Rivers_of_Karnataka", "List_of_dams_and_reservoirs_in_Karnataka", "Taluks_of_Karnataka", "Category:Villages_in_Karnataka", "Mullayanagiri", "Bayalu_Seeme", "Malenadu", "Karavali", "Western_Ghats", "Bharata_Natyam", "Bhuta_Kola", "Bidriware", "Channapatna_toys", "Karnataka_Chitrakala_Parishath", "Gaarudi_Gombe", "Ilkal_saree", "Kamsale", "Kannada", "Carnatic_music", "Kasuti", "Khedda", "Mysore_Dasara", "Togalu_Gombeyaata", "Udupi_cuisine", "Veeragase", "Yakshagana", "Musicians_of_the_Kingdom_of_Mysore", "Asaga", "Gunavarma_I", "Adikavi_Pampa", "Sri_Ponna", "Ranna", "Devar_Dasimayya", "Basava", "Akka_Mahadevi", "Allama_Prabhu", "Siddheshwar", "Harihara_(poet)", "Raghavanka", "Rudrabhatta", "Janna", "Kumara_Vyasa", "Chamarasa", "Nijaguna_Shivayogi", "Ratnakaravarni", "Purandara_Dasa", "Kanaka_Dasa", "Vijaya_Dasa", "Gopala_Dasa", "Jagannatha_Dasa", "Lakshmisa", "Sarvajna", "Shishunala_Sharif", "Krishnaraja_Wadiyar_III", "D._R._Bendre", "Gopalakrishna_Adiga", "K._S._Narasimhaswamy", "M._Govinda_Pai", "Kuvempu", "D._V._Gundappa", "G._S._Shivarudrappa"};
        try {
			PrintWriter outlink = new PrintWriter(new FileWriter("C:\\Users\\Deepak\\Legends\\link.txt"));
			for (int i1=0;i1<thisIsAStringArray.length;i1++)
	        {
			 outlink.write("\r\n");
	     	   String name=thisIsAStringArray[i1].replaceAll("_", "-");
	     	   System.out.println("http://legendshub.com/"+name);
	        outlink.write("http://legendshub.com/"+name);
	        }
        
        } catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

        //output to the file a line
        

        
        
     //   for (int i=0;i<thisIsAStringArray.length;i++)
        for (int i=0;i<thisIsAStringArray.length;i++)
        {
          //  String url = "https://en.wikipedia.org/w/api.php?format=json&action=query&prop=extracts&titles="+thisIsAStringArray[i] +"&redirects=true";
             String url = "https://en.wikipedia.org/wiki/"+thisIsAStringArray[i];
        	
        	 String url1 = "https://en.wikipedia.org/w/api.php?action=query&titles="+thisIsAStringArray[i]+"&prop=pageimages&format=json&pithumbsize=200";

        	
        try {
            is = new URL(url).openStream();
            BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
            String jsonText = readAll(rd);
            
            is1 = new URL(url1).openStream();
            BufferedReader rd1 = new BufferedReader(new InputStreamReader(is1, Charset.forName("UTF-8")));
            String jsonTextforImage = readAll(rd1);
            
          String PageId = StringUtils.substringBetween(jsonTextforImage, "\"pages\":{\"", "\":{\"pageid\":");
           //System.out.println(PageId);
            JsonElement je = new JsonParser().parse(jsonTextforImage);
          // System.out.println(jsonTextforImage);
            //System.out.println("In " + getAtPath(je, "query/pages/274600/extract").getAsString() + " is " + getAtPath(je, "query/pages/274600/extract").getAsString());
           String TextExtract="";
           
if(jsonTextforImage.contains("thumbnail"))
{
            TextExtract=getAtPath(je, "query/pages/"+PageId+"/thumbnail/source").getAsString();
 
            TextExtract="<img src=\""+TextExtract+"\" alt=\"Mountain View\" style=\"width:200px;height:200px;\">";
}
          // String a= "<style>a {      text-decoration:none;       color:black;       redirect: false;        pointer-events: none;    } </style> "+ "[tabby title=\"OverView\"]"+ jsonText+ " [tabbyending] </body> </html>" ;
           
          /* String  str2=a.replaceAll("(?<=\\[)(.*?)(?=\\])", "");
           str2=str2.replaceAll("\\[]", "");
           str2=str2.replaceAll("(?<=<meta charset=\"UTF-8\"/>)(.*?)(?=</table><p>)", "");
           str2=str2.replaceAll("(?<=<span class=\"mw-headline\" id=\"See_also\">)(.*?)(?=</script>  </body>)", "");
           str2=str2.replaceAll("(?<=<h2>Contents</h2>)(.*?)(?=<h2><span class)", "");
           str2=str2.replaceAll("<h2>Contents</h2>", "");
           str2=a.replaceAll("(?<=<td class=\"mbox)(.*?)(?=/td>])", ""); */
            
          //  BufferedReader r=new BufferedReader(new FileReader("C:\\Users\\Deepak\\Legends\\"+thisIsAStringArray[i]+".html"));
           String str2="", line=null;
           /*while ((line = r.readLine())!=null)
        		   {
        	   str2+=line;
        	   
        		   } */
           str2=jsonText.replaceAll("(?<=\\[)(.*?)(?=\\])", "");
           str2=str2.replaceAll("\\[]", "");
           str2=str2.replaceAll("(?<=<meta charset=\"UTF-8\"/>)(.*?)(?=</table><p>)", "");

           str2=str2.replaceAll("(?<=<span class=\"mw-headline\" id=\"See_also\">)(.*?)(?=</script>  </body>)", "");
           str2=str2.replaceAll("(?<=<span class=\"mw-headline\" id=\"References\">)(.*?)(?=</script>  </body>)", "");
           
           str2=str2.replaceAll("(?<=<h2>Contents</h2>)(.*?)(?=<h2><span class)", "");
           str2=str2.replaceAll("(?<=<a)(.*?)(?=\">)", "");
           str2=str2.replaceAll("(?<=<span class=\"mw-headline\" id=\"See_also\">)(.*?)(?=</body>)", "");
           str2=str2.replaceAll("(?<=<span class=\"mw-headline\" id=\"References\">)(.*?)(?=</body>)", "");
           str2=str2.replaceAll("(?<=<span class=\"mw-headline\" id=\"Notes\">)(.*?)(?=</body>)", "");
           str2=str2.replaceAll("(?<=<span class=\"mw-headline\" id=\"External links\">)(.*?)(?=</body>)", "");
           str2=str2.replaceAll("(?<=<span class=\"mw-headline\" id=\"Bibliography\">)(.*?)(?=</body>)", "");
           str2=str2.replaceAll("(?<=<span class=\"mw-headline\" id=\"Further reading\">)(.*?)(?=</body>)", "");
           str2=str2.replaceAll("(?<=<span class=\"mw-headline\" id=\"Accolades\">)(.*?)(?=</body>)", "");
           str2=str2.replaceAll("(?<=<span class=\"mw-headline\" id=\"Notes and references\">)(.*?)(?=</body>)", "");
           str2=str2.replaceAll("(?<=<span class=\"mw-headline\" id=\"Citations\">)(.*?)(?=</body>)", "");
           str2=str2.replaceAll("(?<=<span class=\"mw-headline\" id=\"Later_life\">)(.*?)(?=</body>)", "");
           
           str2=str2.replaceAll("(?<=<span class=\"mw-headline\" id=\"Filmography\">)(.*?)(?=</body>)", "");
           
           str2=str2.replaceAll("<h2>Contents</h2>", "");
          
         // str2=str2.replaceAll("(?<=<td class=\"mbox)(.*?)(?=</td>)", "");
          //str2=str2.replaceAll("tabby title=\"</body>\"", "</body>");
          //str2=str2.replaceAll("(?<=<h2><span id)(.*?)(?=</h2>)", "");
          
          str2=str2.replaceAll("(?<=<h2><span id)</h2>", "");
          str2=str2.replaceAll("</span><span class=\"mw-editsection\"><span class=\"mw-editsection-bracket\"></span></span></h2>","tabbyend");
          str2=str2.replaceAll("<h2><span class=\"mw-headline\" id=\"","[tabby title=\"");
          str2=str2.replaceAll("<h2><span class=\"mw-headline\" id=\"","[tabby title=\"");
          str2=str2.replaceAll("<h2><span class=\"mw-headline\" id=\"","[tabby title=\"");
          str2=str2.replaceAll("(?<=tabby title=\")(.*?)(?=\">)", "");
         // str2=str2.replaceAll("[tabby title=\"</body></html>", "[tabbyending] </body> </html>");
          //System.out.println(str2); 
          str2=str2.replaceAll("tabby title=\"\"></body></html>", "tabbyending] </body> </html>");
          
          str2=str2.replaceAll("(?<=<title>)(.*?)(?=<p>)", "");
          str2=str2.replaceAll("<title><p>", "");
          str2=str2.replaceAll("<!DOCTYPE html><html class=\"client-nojs\" lang=\"en\" dir=\"ltr\"><head><meta charset=\"UTF-8\"/>","<!DOCTYPE html> <html> <head> <title>Page Title</title> </head> <body>"+TextExtract+"[tabby title=\"Overview\"]");
          str2=str2.replaceAll("\"\">", "\"");
          str2=str2.replaceAll("<div class=\"toclimit-3\">","");
          
          str2=str2.replaceAll("</span></h2>","\"]");
          str2=str2.replaceAll("<h2>", "");
          str2=str2.replaceAll("</h2>", "");
          str2=str2.replaceAll("tabbyend","\"]");
          str2=str2.replaceAll("\"]ing] </body> </html>","tabbyending] </body> </html>");
          str2=str2.replaceAll("<a\">","<a>");
          str2=str2.replaceAll("<span class=\"nowrap\">\\;","");
          str2=str2.replaceAll("(?<=<span class=\"nowrap\">)(.*?)(?=;)", "");
          str2=str2.replaceAll("<div id=\"toc\" class=\"toc\"><div class=\"toctitle\">","");
          //System.out.println(str2);
          
          str2=str2.replaceAll("(?<=Main article:)(.*?)(?=</a>)", "");
          str2=str2.replaceAll("Main article:</a>", "");
          
          str2=str2.replaceAll("(?<=Further information:)(.*?)(?=</a>)", "");
          str2=str2.replaceAll("Further information:</a>", "");
          
          str2=str2.replaceAll("Page Title", "");
          str2=str2.replaceAll("\\?{2,}", "");
          str2=str2.replaceAll("–", "-");
          str2=str2.replaceAll("[^\\x00-\\x7F]", "");
         // str2=Beautify.prettyPrintHTML(str2);
           //tabby..
         /*str2=str2.replaceAll("(?<=<h2><span class)(.*?)(?=\">)", "");
           str2=str2.replaceAll("<h2><span class", "[tabby title=\"");
           str2=str2.replaceAll("\"\">", "\"");
           
         
            str2=str2.replaceAll("/span></h2>", "\"]");
            str2=str2.replaceAll("</span><span class=\"mw-editsection\"><span class=\"mw-editsection-bracket\"></span><\"]", "\"]");
            str2=str2.replace("[tabbytitle=\"References\"]", "");
            str2=str2.replace("[tabbytitle=\"External links\"]", ""); 
            str2=str2.replaceAll("<\"]", "\"]");
            str2 = "<style>a {      text-decoration:none;       color:black;       redirect: false;        pointer-events: none;    } </style> "+ str2 ;
            */
           //System.out.println(str2); 
           PrintWriter out = new PrintWriter(new FileWriter("C:\\Users\\Deepak\\Legends\\"+thisIsAStringArray[i]+".html"));
           PrintWriter out1 = new PrintWriter(new FileWriter("C:\\Users\\Deepak\\Legends\\"+thisIsAStringArray[i]+".doc"));

           //output to the file a line
           out.println(str2);
           out1.println(str2);
           //close the file (VERY IMPORTANT!)
           out.close();
           out1.close();
           
          
           
           
           FTPClient ftpclient = new FTPClient();
           try {
           	
               FTPUtils.ftpConnect(ftpclient, "legendshub.com", "Legendsworld@legendshub.com", "Humans@1234");
               
           	
               ftpclient.enterLocalPassiveMode();
               ftpclient.setFileType(FTP.BINARY_FILE_TYPE, FTP.BINARY_FILE_TYPE);
               ftpclient.setFileTransferMode(FTP.BINARY_FILE_TYPE);
//upload ftp is commented
          FTPUtils.uploadFile(ftpclient, "C:\\Users\\Deepak\\Legends\\"+thisIsAStringArray[i]+".html", "/public_html/html_files/"+thisIsAStringArray[i]+".html");
           } catch (IOException e) {
               // TODO Auto-generated catch block
               e.printStackTrace();
           }
           
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();

        } finally {
            try {
                if (is != null)
                    is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        
        
        
    
        }
     
      //commented difference part
      /*
        try {
        	
			Comp.getDiff(dir1, dir2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/	
        }

}