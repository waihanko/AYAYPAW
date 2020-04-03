package com.contactList.ayaypaw.data;

import com.contactList.ayaypaw.data_model.StateModel;
import com.contactList.ayaypaw.data_model.TownshipModel;

import java.util.ArrayList;

public class TownshipCreator {
    private static TownshipCreator townshipCreator;

    public static TownshipCreator getInstance() {
        if (townshipCreator == null) {
            townshipCreator = new TownshipCreator();
        }
        return townshipCreator;
    }

    public ArrayList<TownshipModel> getAllTownshipList() {
        ArrayList<TownshipModel> townshipList = new ArrayList<TownshipModel>();
        townshipList.add(new TownshipModel("MMR001D003", "Bhamo", "MMR001010", "ဗန်းမော်", "Bhamo"));
        townshipList.add(new TownshipModel("MMR001D001", "Myitkyina", "MMR001005", "ချီဗွေ", "Chipwi"));
        townshipList.add(new TownshipModel("MMR001D002", "Mohnyin", "MMR001009", "ဖားကန့်", "Hpakant"));
        townshipList.add(new TownshipModel("MMR001D001", "Myitkyina", "MMR001003", "အင်ဂျန်းယန်", "Injangyang"));
        townshipList.add(new TownshipModel("MMR001D004", "Puta-O", "MMR001018", "ခေါင်လန်ဖူး", "Khaunglanhpu"));
        townshipList.add(new TownshipModel("MMR001D004", "Puta-O", "MMR001016", "မချမ်းဘော", "Machanbaw"));
        townshipList.add(new TownshipModel("MMR001D003", "Bhamo", "MMR001013", "မန်စီ", "Mansi"));
        townshipList.add(new TownshipModel("MMR001D002", "Mohnyin", "MMR001008", "မိုးကောင်း", "Mogaung"));
        townshipList.add(new TownshipModel("MMR001D002", "Mohnyin", "MMR001007", "မိုးညှင်း", "Mohnyin"));
        townshipList.add(new TownshipModel("MMR001D003", "Bhamo", "MMR001012", "မိုးမောက်", "Momauk"));
        townshipList.add(new TownshipModel("MMR001D001", "Myitkyina", "MMR001001", "မြစ်ကြီးနား", "Myitkyina"));
        townshipList.add(new TownshipModel("MMR001D004", "Puta-O", "MMR001017", "နောင်မွန်း", "Nawngmun"));
        townshipList.add(new TownshipModel("MMR001D004", "Puta-O", "MMR001014", "ပူတာအို", "Puta-O"));
        townshipList.add(new TownshipModel("MMR001D003", "Bhamo", "MMR001011", "ရွှေကူ", "Shwegu"));
        townshipList.add(new TownshipModel("MMR001D004", "Puta-O", "MMR001015", "ဆွမ်ပရာဘွမ်", "Sumprabum"));
        townshipList.add(new TownshipModel("MMR001D001", "Myitkyina", "MMR001004", "တနိုင်း", "Tanai"));
        townshipList.add(new TownshipModel("MMR001D001", "Myitkyina", "MMR001006", "ဆော့လော်", "Tsawlaw"));
        townshipList.add(new TownshipModel("MMR001D001", "Myitkyina", "MMR001002", "ဝိုင်းမော်", "Waingmaw"));
        townshipList.add(new TownshipModel("MMR002D002", "Bawlake", "MMR002005", "ဘောလခဲ", "Bawlake"));
        townshipList.add(new TownshipModel("MMR002D001", "Loikaw", "MMR002002", "ဒီမောဆို", "Demoso"));
        townshipList.add(new TownshipModel("MMR002D002", "Bawlake", "MMR002006", "ဖားဆောင်း", "Hpasawng"));
        townshipList.add(new TownshipModel("MMR002D001", "Loikaw", "MMR002003", "ဖရူဆို", "Hpruso"));
        townshipList.add(new TownshipModel("MMR002D001", "Loikaw", "MMR002001", "လွိုင်ကော်", "Loikaw"));
        townshipList.add(new TownshipModel("MMR002D002", "Bawlake", "MMR002007", "မယ်စဲ့", "Mese"));
        townshipList.add(new TownshipModel("MMR002D001", "Loikaw", "MMR002004", "ရှားတော", "Shadaw"));
        townshipList.add(new TownshipModel("MMR003D001", "Hpa-An", "MMR003002", "လှိုင်းဘွဲ့", "Hlaingbwe"));
        townshipList.add(new TownshipModel("MMR003D001", "Hpa-An", "MMR003001", "ဘားအံ", "Hpa-An"));
        townshipList.add(new TownshipModel("MMR003D004", "Hpapun", "MMR003003", "ဖာပွန်", "Hpapun"));
        townshipList.add(new TownshipModel("MMR003D003", "Kawkareik", "MMR003006", "ကော့ကရိတ်", "Kawkareik"));
        townshipList.add(new TownshipModel("MMR003D003", "Kawkareik", "MMR003007", "ကြာအင်းဆိပ်ကြီး", "Kyainseikgyi"));
        townshipList.add(new TownshipModel("MMR003D002", "Myawaddy", "MMR003005", "မြဝတီ", "Myawaddy"));
        townshipList.add(new TownshipModel("MMR003D001", "Hpa-An", "MMR003004", "သံတောင်ကြီး", "Thandaunggyi"));
        townshipList.add(new TownshipModel("MMR004D001", "Falam", "MMR004001", "ဖလမ်း", "Falam"));
        townshipList.add(new TownshipModel("MMR004D003", "Hakha", "MMR004002", "ဟားခါး", "Hakha"));
        townshipList.add(new TownshipModel("MMR004D002", "Mindat", "MMR004008", "ကန်ပက်လက်", "Kanpetlet"));
        townshipList.add(new TownshipModel("MMR004D002", "Mindat", "MMR004007", "မတူပီ", "Matupi"));
        townshipList.add(new TownshipModel("MMR004D002", "Mindat", "MMR004006", "မင်းတပ်", "Mindat"));
        townshipList.add(new TownshipModel("MMR004D002", "Mindat", "MMR004009", "ပလက်ဝ", "Paletwa"));
        townshipList.add(new TownshipModel("MMR004D001", "Falam", "MMR004004", "တီးတိန်", "Tedim"));
        townshipList.add(new TownshipModel("MMR004D003", "Hakha", "MMR004003", "ထန်တလန်", "Thantlang"));
        townshipList.add(new TownshipModel("MMR004D001", "Falam", "MMR004005", "တွန်းဇံ", "Tonzang"));
        townshipList.add(new TownshipModel("MMR005D003", "Monywa", "MMR005014", "အရာတော်", "Ayadaw"));
        townshipList.add(new TownshipModel("MMR005D004", "Katha", "MMR005023", "ဗန်းမောက်", "Banmauk"));
        townshipList.add(new TownshipModel("MMR005D003", "Monywa", "MMR005013", "ဘုတလင်", "Budalin"));
        townshipList.add(new TownshipModel("MMR005D003", "Monywa", "MMR005015", "ချောင်းဦး", "Chaung-U"));
        townshipList.add(new TownshipModel("MMR005D008", "Hkamti", "MMR005033", "ခန္တီး", "Hkamti"));
        townshipList.add(new TownshipModel("MMR005D008", "Hkamti", "MMR005034", "ဟုမ္မလင်း", "Homalin"));
        townshipList.add(new TownshipModel("MMR005D004", "Katha", "MMR005021", "အင်းတော်", "Indaw"));
        townshipList.add(new TownshipModel("MMR005D005", "Kale", "MMR005027", "ကလေး", "Kale"));
        townshipList.add(new TownshipModel("MMR005D005", "Kale", "MMR005028", "ကလေးဝ", "Kalewa"));
        townshipList.add(new TownshipModel("MMR005D010", "Kanbalu", "MMR005007", "ကန့်ဘလူ", "Kanbalu"));
        townshipList.add(new TownshipModel("MMR005D009", "Yinmarbin", "MMR005017", "ကနီ", "Kani"));
        townshipList.add(new TownshipModel("MMR005D004", "Katha", "MMR005020", "ကသာ", "Katha"));
        townshipList.add(new TownshipModel("MMR005D004", "Katha", "MMR005024", "ကောလင်း", "Kawlin"));
        townshipList.add(new TownshipModel("MMR005D002", "Shwebo", "MMR005005", "ခင်ဦး", "Khin-U"));
        townshipList.add(new TownshipModel("MMR005D010", "Kanbalu", "MMR005008", "ကျွန်းလှ", "Kyunhla"));
        townshipList.add(new TownshipModel("MMR005D008", "Hkamti", "MMR005036", "လဟယ်", "Lahe"));
        townshipList.add(new TownshipModel("MMR005D008", "Hkamti", "MMR005035", "လေရှီး", "Lay Shi"));
        townshipList.add(new TownshipModel("MMR005D007", "Mawlaik", "MMR005031", "မော်လိုက်", "Mawlaik"));
        townshipList.add(new TownshipModel("MMR005D005", "Kale", "MMR005029", "မင်းကင်း", "Mingin"));
        townshipList.add(new TownshipModel("MMR005D003", "Monywa", "MMR005012", "မုံရွာ", "Monywa"));
        townshipList.add(new TownshipModel("MMR005D001", "Sagaing", "MMR005003", "မြောင်", "Myaung"));
        townshipList.add(new TownshipModel("MMR005D001", "Sagaing", "MMR005002", "မြင်းမူ", "Myinmu"));
        townshipList.add(new TownshipModel("MMR005D008", "Hkamti", "MMR005037", "နန်းယွန်း", "Nanyun"));
        townshipList.add(new TownshipModel("MMR005D009", "Yinmarbin", "MMR005019", "ပုလဲ", "Pale"));
        townshipList.add(new TownshipModel("MMR005D007", "Mawlaik", "MMR005032", "ဖေါင်းပြင်", "Paungbyin"));
        townshipList.add(new TownshipModel("MMR005D004", "Katha", "MMR005026", "ပင်လည်ဘူး", "Pinlebu"));
        townshipList.add(new TownshipModel("MMR005D001", "Sagaing", "MMR005001", "စစ်ကိုင်း", "Sagaing"));
        townshipList.add(new TownshipModel("MMR005D009", "Yinmarbin", "MMR005018", "ဆားလင်းကြီး", "Salingyi"));
        townshipList.add(new TownshipModel("MMR005D002", "Shwebo", "MMR005004", "ရွှေဘို", "Shwebo"));
        townshipList.add(new TownshipModel("MMR005D002", "Shwebo", "MMR005010", "ဒီပဲယင်း", "Tabayin"));
        townshipList.add(new TownshipModel("MMR005D006", "Tamu", "MMR005030", "တမူး", "Tamu"));
        townshipList.add(new TownshipModel("MMR005D002", "Shwebo", "MMR005011", "တန့်ဆည်", "Taze"));
        townshipList.add(new TownshipModel("MMR005D004", "Katha", "MMR005022", "ထီးချိုင့်", "Tigyaing"));
        townshipList.add(new TownshipModel("MMR005D002", "Shwebo", "MMR005006", "ဝက်လက်", "Wetlet"));
        townshipList.add(new TownshipModel("MMR005D004", "Katha", "MMR005025", "ဝန်းသို", "Wuntho"));
        townshipList.add(new TownshipModel("MMR005D002", "Shwebo", "MMR005009", "ရေဦး", "Ye-U"));
        townshipList.add(new TownshipModel("MMR005D009", "Yinmarbin", "MMR005016", "ယင်းမာပင်", "Yinmarbin"));
        townshipList.add(new TownshipModel("MMR006D003", "Kawthoung", "MMR006010", "ဘုတ်ပြင်း", "Bokpyin"));
        townshipList.add(new TownshipModel("MMR006D001", "Dawei", "MMR006001", "ထားဝယ်", "Dawei"));
        townshipList.add(new TownshipModel("MMR006D003", "Kawthoung", "MMR006009", "ကော့သောင်း", "Kawthoung"));
        townshipList.add(new TownshipModel("MMR006D002", "Myeik", "MMR006006", "ကျွန်းစု", "Kyunsu"));
        townshipList.add(new TownshipModel("MMR006D001", "Dawei", "MMR006002", "လောင်းလုံ", "Launglon"));
        townshipList.add(new TownshipModel("MMR006D002", "Myeik", "MMR006005", "မြိတ်", "Myeik"));
        townshipList.add(new TownshipModel("MMR006D002", "Myeik", "MMR006007", "ပုလော", "Palaw"));
        townshipList.add(new TownshipModel("MMR006D002", "Myeik", "MMR006008", "တနင်္သာရီ", "Tanintharyi"));
        townshipList.add(new TownshipModel("MMR006D001", "Dawei", "MMR006003", "သရက်ချောင်း", "Thayetchaung"));
        townshipList.add(new TownshipModel("MMR006D001", "Dawei", "MMR006004", "ရေဖြူ", "Yebyu"));
        townshipList.add(new TownshipModel("MMR007D001", "Bago", "MMR007001", "ပဲခူး", "Bago"));
        townshipList.add(new TownshipModel("MMR007D001", "Bago", "MMR007007", "ဒိုက်ဦး", "Daik-U"));
        townshipList.add(new TownshipModel("MMR007D002", "Taungoo", "MMR007014", "ထန်းတပင်", "Htantabin"));
        townshipList.add(new TownshipModel("MMR007D001", "Bago", "MMR007003", "ကဝ", "Kawa"));
        townshipList.add(new TownshipModel("MMR007D002", "Taungoo", "MMR007011", "ကျောက်ကြီး", "Kyaukkyi"));
        townshipList.add(new TownshipModel("MMR007D001", "Bago", "MMR007006", "ကျောက်တံခါး", "Kyauktaga"));
        townshipList.add(new TownshipModel("MMR007D001", "Bago", "MMR007005", "ညောင်လေးပင်", "Nyaunglebin"));
        townshipList.add(new TownshipModel("MMR007D002", "Taungoo", "MMR007013", "အုတ်တွင်း", "Oktwin"));
        townshipList.add(new TownshipModel("MMR007D002", "Taungoo", "MMR007012", "ဖြူး", "Phyu"));
        townshipList.add(new TownshipModel("MMR007D001", "Bago", "MMR007008", "ရွှေကျင်", "Shwegyin"));
        townshipList.add(new TownshipModel("MMR007D002", "Taungoo", "MMR007009", "တောင်ငူ", "Taungoo"));
        townshipList.add(new TownshipModel("MMR007D001", "Bago", "MMR007002", "သနပ်ပင်", "Thanatpin"));
        townshipList.add(new TownshipModel("MMR007D001", "Bago", "MMR007004", "ဝေါ", "Waw"));
        townshipList.add(new TownshipModel("MMR007D002", "Taungoo", "MMR007010", "ရေတာရှည်", "Yedashe"));
        townshipList.add(new TownshipModel("MMR008D002", "Thayarwady", "MMR008014", "ကြို့ပင်ကောက်", "Gyobingauk"));
        townshipList.add(new TownshipModel("MMR008D002", "Thayarwady", "MMR008008", "လက်ပံတန်း", "Letpadan"));
        townshipList.add(new TownshipModel("MMR008D002", "Thayarwady", "MMR008009", "မင်းလှ", "Minhla"));
        townshipList.add(new TownshipModel("MMR008D002", "Thayarwady", "MMR008013", "မိုးညို", "Monyo"));
        townshipList.add(new TownshipModel("MMR008D002", "Thayarwady", "MMR008012", "နတ္တလင်း", "Nattalin"));
        townshipList.add(new TownshipModel("MMR008D002", "Thayarwady", "MMR008010", "အုတ်ဖို", "Okpho"));
        townshipList.add(new TownshipModel("MMR008D001", "Pyay", "MMR008003", "ပန်းတောင်း", "Padaung"));
        townshipList.add(new TownshipModel("MMR008D001", "Pyay", "MMR008002", "ပေါက်ခေါင်း", "Paukkhaung"));
        townshipList.add(new TownshipModel("MMR008D001", "Pyay", "MMR008004", "ပေါင်းတည်", "Paungde"));
        townshipList.add(new TownshipModel("MMR008D001", "Pyay", "MMR008001", "ပြည်", "Pyay"));
        townshipList.add(new TownshipModel("MMR008D001", "Pyay", "MMR008006", "ရွှေတောင်", "Shwedaung"));
        townshipList.add(new TownshipModel("MMR008D002", "Thayarwady", "MMR008007", "သာယာဝတီ", "Thayarwady"));
        townshipList.add(new TownshipModel("MMR008D001", "Pyay", "MMR008005", "သဲကုန်း", "Thegon"));
        townshipList.add(new TownshipModel("MMR008D002", "Thayarwady", "MMR008011", "ဇီးကုန်း", "Zigon"));
        townshipList.add(new TownshipModel("MMR009D003", "Thayet", "MMR009016", "အောင်လံ", "Aunglan"));
        townshipList.add(new TownshipModel("MMR009D001", "Magway", "MMR009003", "ချောက်", "Chauk"));
        townshipList.add(new TownshipModel("MMR009D005", "Gangaw", "MMR009023", "ဂန့်ဂေါ", "Gangaw"));
        townshipList.add(new TownshipModel("MMR009D003", "Thayet", "MMR009015", "ကံမ", "Kamma"));
        townshipList.add(new TownshipModel("MMR009D001", "Magway", "MMR009001", "မကွေး", "Magway"));
        townshipList.add(new TownshipModel("MMR009D002", "Minbu", "MMR009007", "မင်းဘူး", "Minbu"));
        townshipList.add(new TownshipModel("MMR009D003", "Thayet", "MMR009014", "မင်းတုန်း", "Mindon"));
        townshipList.add(new TownshipModel("MMR009D003", "Thayet", "MMR009013", "မင်းလှ", "Minhla"));
        townshipList.add(new TownshipModel("MMR009D004", "Pakokku", "MMR009020", "မြိုင်", "Myaing"));
        townshipList.add(new TownshipModel("MMR009D001", "Magway", "MMR009005", "မြို့သစ်", "Myothit"));
        townshipList.add(new TownshipModel("MMR009D001", "Magway", "MMR009006", "နတ်မောက်", "Natmauk"));
        townshipList.add(new TownshipModel("MMR009D002", "Minbu", "MMR009009", "ငဖဲ", "Ngape"));
        townshipList.add(new TownshipModel("MMR009D004", "Pakokku", "MMR009018", "ပခုက္ကူ", "Pakokku"));
        townshipList.add(new TownshipModel("MMR009D004", "Pakokku", "MMR009021", "ပေါက်", "Pauk"));
        townshipList.add(new TownshipModel("MMR009D002", "Minbu", "MMR009008", "ပွင့်ဖြူ", "Pwintbyu"));
        townshipList.add(new TownshipModel("MMR009D002", "Minbu", "MMR009010", "စလင်း", "Salin"));
        townshipList.add(new TownshipModel("MMR009D005", "Gangaw", "MMR009025", "ဆော", "Saw"));
        townshipList.add(new TownshipModel("MMR009D004", "Pakokku", "MMR009022", "ဆိပ်ဖြူ", "Seikphyu"));
        townshipList.add(new TownshipModel("MMR009D002", "Minbu", "MMR009011", "စေတုတ္တရာ", "Sidoktaya"));
        townshipList.add(new TownshipModel("MMR009D003", "Thayet", "MMR009017", "ဆင်ပေါင်ဝဲ", "Sinbaungwe"));
        townshipList.add(new TownshipModel("MMR009D001", "Magway", "MMR009004", "တောင်တွင်းကြီး", "Taungdwingyi"));
        townshipList.add(new TownshipModel("MMR009D003", "Thayet", "MMR009012", "သရက်", "Thayet"));
        townshipList.add(new TownshipModel("MMR009D005", "Gangaw", "MMR009024", "ထီးလင်း", "Tilin"));
        townshipList.add(new TownshipModel("MMR009D001", "Magway", "MMR009002", "ရေနံချောင်း", "Yenangyaung"));
        townshipList.add(new TownshipModel("MMR009D004", "Pakokku", "MMR009019", "ရေစကြို", "Yesagyo"));
        townshipList.add(new TownshipModel("MMR010D001", "Mandalay", "MMR010006", "အမရပူရ", "Amarapura"));
        townshipList.add(new TownshipModel("MMR010D001", "Mandalay", "MMR010001", "အောင်မြေသာဇံ", "Aungmyaythazan"));
        townshipList.add(new TownshipModel("MMR010D001", "Mandalay", "MMR010002", "ချမ်းအေးသာဇံ", "Chanayethazan"));
        townshipList.add(new TownshipModel("MMR010D001", "Mandalay", "MMR010004", "ချမ်းမြသာစည်", "Chanmyathazi"));
        townshipList.add(new TownshipModel("MMR010D005", "Nyaung-U", "MMR010020", "ကျောက်ပန်းတောင်း", "Kyaukpadaung"));
        townshipList.add(new TownshipModel("MMR010D003", "Kyaukse", "MMR010013", "ကျောက်ဆည်", "Kyaukse"));
        townshipList.add(new TownshipModel("MMR010D002", "Pyinoolwin", "MMR010009", "မတ္တရာ", "Madaya"));
        townshipList.add(new TownshipModel("MMR010D001", "Mandalay", "MMR010003", "မဟာအောင်မြေ", "Mahaaungmyay"));
        townshipList.add(new TownshipModel("MMR010D007", "Meiktila", "MMR010029", "မလှိုင်", "Mahlaing"));
        townshipList.add(new TownshipModel("MMR010D007", "Meiktila", "MMR010028", "မိတ္ထီလာ", "Meiktila"));
        townshipList.add(new TownshipModel("MMR010D002", "Pyinoolwin", "MMR010011", "မိုးကုတ်", "Mogoke"));
        townshipList.add(new TownshipModel("MMR010D004", "Myingyan", "MMR010017", "မြင်းခြံ", "Myingyan"));
        townshipList.add(new TownshipModel("MMR010D003", "Kyaukse", "MMR010015", "မြစ်သား", "Myittha"));
        townshipList.add(new TownshipModel("MMR010D004", "Myingyan", "MMR010019", "နွားထိုးကြီး", "Natogyi"));
        townshipList.add(new TownshipModel("MMR010D004", "Myingyan", "MMR010021", "ငါန်းဇွန်", "Ngazun"));
        townshipList.add(new TownshipModel("MMR010D005", "Nyaung-U", "MMR010022", "ညောင်ဦး", "Nyaung-U"));
        townshipList.add(new TownshipModel("MMR010D001", "Mandalay", "MMR010007", "ပုသိမ်ကြီး", "Patheingyi"));
        townshipList.add(new TownshipModel("MMR010D006", "Yamethin", "MMR010024", "ပျော်ဘွယ်", "Pyawbwe"));
        townshipList.add(new TownshipModel("MMR010D001", "Mandalay", "MMR010005", "ပြည်ကြီးတံခွန်", "Pyigyitagon"));
        townshipList.add(new TownshipModel("MMR010D002", "Pyinoolwin", "MMR010008", "ပြင်ဦးလွင်", "Pyinoolwin"));
        townshipList.add(new TownshipModel("MMR010D002", "Pyinoolwin", "MMR010010", "စဉ့်ကူး", "Singu"));
        townshipList.add(new TownshipModel("MMR010D003", "Kyaukse", "MMR010014", "စဉ့်ကိုင်", "Sintgaing"));
        townshipList.add(new TownshipModel("MMR010D003", "Kyaukse", "MMR010016", "တံတားဦး", "Tada-U"));
        townshipList.add(new TownshipModel("MMR010D004", "Myingyan", "MMR010018", "တောင်သာ", "Taungtha"));
        townshipList.add(new TownshipModel("MMR010D002", "Pyinoolwin", "MMR010012", "သပိတ်ကျဉ်း", "Thabeikkyin"));
        townshipList.add(new TownshipModel("MMR010D007", "Meiktila", "MMR010030", "သာစည်", "Thazi"));
        townshipList.add(new TownshipModel("MMR010D007", "Meiktila", "MMR010031", "ဝမ်းတွင်း", "Wundwin"));
        townshipList.add(new TownshipModel("MMR010D006", "Yamethin", "MMR010023", "ရမည်းသင်း", "Yamethin"));
        townshipList.add(new TownshipModel("MMR011D002", "Thaton", "MMR011010", "ဘီးလင်း", "Bilin"));
        townshipList.add(new TownshipModel("MMR011D001", "Mawlamyine", "MMR011003", "ချောင်းဆုံ", "Chaungzon"));
        townshipList.add(new TownshipModel("MMR011D001", "Mawlamyine", "MMR011002", "ကျိုက္မရော", "Kyaikmaraw"));
        townshipList.add(new TownshipModel("MMR011D002", "Thaton", "MMR011009", "ကျိုက်ထို", "Kyaikto"));
        townshipList.add(new TownshipModel("MMR011D001", "Mawlamyine", "MMR011001", "မော်လမြိုင်", "Mawlamyine"));
        townshipList.add(new TownshipModel("MMR011D001", "Mawlamyine", "MMR011005", "မုဒုံ", "Mudon"));
        townshipList.add(new TownshipModel("MMR011D002", "Thaton", "MMR011008", "ပေါင်", "Paung"));
        townshipList.add(new TownshipModel("MMR011D001", "Mawlamyine", "MMR011004", "သံဖြူဇရပ်", "Thanbyuzayat"));
        townshipList.add(new TownshipModel("MMR011D002", "Thaton", "MMR011007", "သထုံ", "Thaton"));
        townshipList.add(new TownshipModel("MMR011D001", "Mawlamyine", "MMR011006", "ရေး", "Ye"));
        townshipList.add(new TownshipModel("MMR012D003", "Kyaukpyu", "MMR012014", "အမ်း", "Ann"));
        townshipList.add(new TownshipModel("MMR012D002", "Maungdaw", "MMR012010", "ဘူးသီးတောင်", "Buthidaung"));
        townshipList.add(new TownshipModel("MMR012D004", "Thandwe", "MMR012017", "ဂွ", "Gwa"));
        townshipList.add(new TownshipModel("MMR012D003", "Kyaukpyu", "MMR012011", "ကျောက်ဖြူ", "Kyaukpyu"));
        townshipList.add(new TownshipModel("MMR012D005", "Mrauk-U", "MMR012004", "ကျောက်တော်", "Kyauktaw"));
        townshipList.add(new TownshipModel("MMR012D002", "Maungdaw", "MMR012009", "မောင်တော", "Maungdaw"));
        townshipList.add(new TownshipModel("MMR012D005", "Mrauk-U", "MMR012005", "မင်းပြား", "Minbya"));
        townshipList.add(new TownshipModel("MMR012D005", "Mrauk-U", "MMR012003", "မြောက်ဦး", "Mrauk-U"));
        townshipList.add(new TownshipModel("MMR012D003", "Kyaukpyu", "MMR012012", "မာန်အောင်", "Munaung"));
        townshipList.add(new TownshipModel("MMR012D005", "Mrauk-U", "MMR012006", "မြေပုံ", "Myebon"));
        townshipList.add(new TownshipModel("MMR012D001", "Sittwe", "MMR012007", "ပေါက်တော", "Pauktaw"));
        townshipList.add(new TownshipModel("MMR012D001", "Sittwe", "MMR012002", "ပုဏ္ဏားကျွန်း", "Ponnagyun"));
        townshipList.add(new TownshipModel("MMR012D003", "Kyaukpyu", "MMR012013", "ရမ်းဗြဲ", "Ramree"));
        townshipList.add(new TownshipModel("MMR012D001", "Sittwe", "MMR012008", "ရသေ့တောင်", "Rathedaung"));
        townshipList.add(new TownshipModel("MMR012D001", "Sittwe", "MMR012001", "စစ်တွေ", "Sittwe"));
        townshipList.add(new TownshipModel("MMR012D004", "Thandwe", "MMR012015", "သံတွဲ", "Thandwe"));
        townshipList.add(new TownshipModel("MMR012D004", "Thandwe", "MMR012016", "တောင်ကုတ်", "Toungup"));
        townshipList.add(new TownshipModel("MMR013D004", "Yangon (West)", "MMR013037", "အလုံ", "Ahlone"));
        townshipList.add(new TownshipModel("MMR013D004", "Yangon (West)", "MMR013044", "ဗဟန်း", "Bahan"));
        townshipList.add(new TownshipModel("MMR013D002", "Yangon (East)", "MMR013017", "ဗိုလ်တထောင်", "Botahtaung"));
        townshipList.add(new TownshipModel("MMR013D003", "Yangon (South)", "MMR013032", "ကိုကိုးကျွန်း", "Cocokyun"));
        townshipList.add(new TownshipModel("MMR013D004", "Yangon (West)", "MMR013043", "ဒဂုံ", "Dagon"));
        townshipList.add(new TownshipModel("MMR013D002", "Yangon (East)", "MMR013020", "ဒဂုံမြို့သစ်အရှေ့ပိုင်း", "Dagon Myothit (East)"));
        townshipList.add(new TownshipModel("MMR013D002", "Yangon (East)", "MMR013019", "ဒဂုံမြို့သစ်မြောက်ပိုင်း", "Dagon Myothit (North)"));
        townshipList.add(new TownshipModel("MMR013D002", "Yangon (East)", "MMR013021", "ဒဂုံမြို့သစ်ဆိပ်ကမ်း", "Dagon Myothit (Seikkan)"));
        townshipList.add(new TownshipModel("MMR013D002", "Yangon (East)", "MMR013018", "ဒဂုံမြို့သစ်တောင်ပိုင်း", "Dagon Myothit (South)"));
        townshipList.add(new TownshipModel("MMR013D003", "Yangon (South)", "MMR013030", "ဒလ", "Dala"));
        townshipList.add(new TownshipModel("MMR013D002", "Yangon (East)", "MMR013014", "ဒေါပုံ", "Dawbon"));
        townshipList.add(new TownshipModel("MMR013D004", "Yangon (West)", "MMR013040", "လှိုင်", "Hlaing"));
        townshipList.add(new TownshipModel("MMR013D001", "Yangon (North)", "MMR013008", "လှိုင်သာယာ", "Hlaingtharya"));
        townshipList.add(new TownshipModel("MMR013D001", "Yangon (North)", "MMR013004", "လှည်းကူး", "Hlegu"));
        townshipList.add(new TownshipModel("MMR013D001", "Yangon (North)", "MMR013003", "မှော်ဘီ", "Hmawbi"));
        townshipList.add(new TownshipModel("MMR013D001", "Yangon (North)", "MMR013006", "ထန်းတပင်", "Htantabin"));
        townshipList.add(new TownshipModel("MMR013D001", "Yangon (North)", "MMR013001", "အင်းစိန်", "Insein"));
        townshipList.add(new TownshipModel("MMR013D004", "Yangon (West)", "MMR013041", "ကမာရွတ်", "Kamaryut"));
        townshipList.add(new TownshipModel("MMR013D003", "Yangon (South)", "MMR013028", "ကော့မှုး", "Kawhmu"));
        townshipList.add(new TownshipModel("MMR013D003", "Yangon (South)", "MMR013026", "ခရမ်း", "Kayan"));
        townshipList.add(new TownshipModel("MMR013D003", "Yangon (South)", "MMR013029", "ကွမ်းခြံကုန်း", "Kungyangon"));
        townshipList.add(new TownshipModel("MMR013D004", "Yangon (West)", "MMR013033", "ကျောက်တံတား", "Kyauktada"));
        townshipList.add(new TownshipModel("MMR013D003", "Yangon (South)", "MMR013024", "ကျောက်တန်း", "Kyauktan"));
        townshipList.add(new TownshipModel("MMR013D004", "Yangon (West)", "MMR013038", "ကြည့်မြင်တိုင်", "Kyeemyindaing"));
        townshipList.add(new TownshipModel("MMR013D004", "Yangon (West)", "MMR013035", "လမ်းမတော်", "Lanmadaw"));
        townshipList.add(new TownshipModel("MMR013D004", "Yangon (West)", "MMR013036", "လသာ", "Latha"));
        townshipList.add(new TownshipModel("MMR013D004", "Yangon (West)", "MMR013042", "မရမ်းကုန်း", "Mayangone"));
        townshipList.add(new TownshipModel("MMR013D001", "Yangon (North)", "MMR013002", "မင်္ဂလာဒုံ", "Mingaladon"));
        townshipList.add(new TownshipModel("MMR013D002", "Yangon (East)", "MMR013022", "မင်္ဂလာတောင်ညွန့်", "Mingalartaungnyunt"));
        townshipList.add(new TownshipModel("MMR013D002", "Yangon (East)", "MMR013012", "မြောက်ဥက္ကလာပ", "North Okkalapa"));
        townshipList.add(new TownshipModel("MMR013D004", "Yangon (West)", "MMR013034", "ပန်းပဲတန်း", "Pabedan"));
        townshipList.add(new TownshipModel("MMR013D002", "Yangon (East)", "MMR013016", "ပုဇွန်တောင်", "Pazundaung"));
        townshipList.add(new TownshipModel("MMR013D004", "Yangon (West)", "MMR013039", "စမ်းချောင်း", "Sanchaung"));
        townshipList.add(new TownshipModel("MMR013D003", "Yangon (South)", "MMR013031", "ဆိပ်ကြီးခနောင်တို", "Seikgyikanaungto"));
        townshipList.add(new TownshipModel("MMR013D004", "Yangon (West)", "MMR013045", "ဆိပ်ကမ်း", "Seikkan"));
        townshipList.add(new TownshipModel("MMR013D001", "Yangon (North)", "MMR013007", "ရွှေပြည်သာ", "Shwepyithar"));
        townshipList.add(new TownshipModel("MMR013D002", "Yangon (East)", "MMR013011", "တောင်ဥက္ကလာပ", "South Okkalapa"));
        townshipList.add(new TownshipModel("MMR013D001", "Yangon (North)", "MMR013005", "တိုက်ကြီး", "Taikkyi"));
        townshipList.add(new TownshipModel("MMR013D002", "Yangon (East)", "MMR013015", "တာမွေ", "Tamwe"));
        townshipList.add(new TownshipModel("MMR013D002", "Yangon (East)", "MMR013013", "သာကေတ", "Thaketa"));
        townshipList.add(new TownshipModel("MMR013D003", "Yangon (South)", "MMR013023", "သန်လျှင်", "Thanlyin"));
        townshipList.add(new TownshipModel("MMR013D002", "Yangon (East)", "MMR013009", "သင်္ဃန်းကျွန်း", "Thingangyun"));
        townshipList.add(new TownshipModel("MMR013D003", "Yangon (South)", "MMR013025", "သုံးခွ", "Thongwa"));
        townshipList.add(new TownshipModel("MMR013D003", "Yangon (South)", "MMR013027", "တွံတေး", "Twantay"));
        townshipList.add(new TownshipModel("MMR013D002", "Yangon (East)", "MMR013010", "ရန်ကင်း", "Yankin"));
        townshipList.add(new TownshipModel("MMR014D001", "Taunggyi", "MMR014003", "ဟိုပုံး", "Hopong"));
        townshipList.add(new TownshipModel("MMR014D001", "Taunggyi", "MMR014004", "ဆီဆိုင်", "Hsihseng"));
        townshipList.add(new TownshipModel("MMR014D001", "Taunggyi", "MMR014005", "ကလော", "Kalaw"));
        townshipList.add(new TownshipModel("MMR014D002", "Loilen", "MMR014014", "ကွန်ဟိန်း", "Kunhing"));
        townshipList.add(new TownshipModel("MMR014D002", "Loilen", "MMR014015", "ကျေးသီး", "Kyethi"));
        townshipList.add(new TownshipModel("MMR014D002", "Loilen", "MMR014012", "လဲချား", "Laihka"));
        townshipList.add(new TownshipModel("MMR014D003", "Langkho", "MMR014018", "လင်းခေး", "Langkho"));
        townshipList.add(new TownshipModel("MMR014D001", "Taunggyi", "MMR014008", "ရပ်စောက်", "Lawksawk"));
        townshipList.add(new TownshipModel("MMR014D002", "Loilen", "MMR014011", "လွိုင်လင်", "Loilen"));
        townshipList.add(new TownshipModel("MMR014D003", "Langkho", "MMR014020", "မောက်မယ်", "Mawkmai"));
        townshipList.add(new TownshipModel("MMR014D002", "Loilen", "MMR014017", "မိုင်းရှုး", "Monghsu"));
        townshipList.add(new TownshipModel("MMR014D002", "Loilen", "MMR014016", "မိုင်းကိုင်", "Mongkaing"));
        townshipList.add(new TownshipModel("MMR014D003", "Langkho", "MMR014019", "မိုးနဲ", "Mongnai"));
        townshipList.add(new TownshipModel("MMR014D003", "Langkho", "MMR014021", "မိုင်းပန်", "Mongpan"));
        townshipList.add(new TownshipModel("MMR014D002", "Loilen", "MMR014013", "နမ့်စန်", "Nansang"));
        townshipList.add(new TownshipModel("MMR014D001", "Taunggyi", "MMR014002", "ညောင်ရွှေ", "Nyaungshwe"));
        townshipList.add(new TownshipModel("MMR014D001", "Taunggyi", "MMR014010", "ဖယ်ခုံ", "Pekon"));
        townshipList.add(new TownshipModel("MMR014D001", "Taunggyi", "MMR014006", "ပင်းတယ", "Pindaya"));
        townshipList.add(new TownshipModel("MMR014D001", "Taunggyi", "MMR014009", "ပင်လောင်း", "Pinlaung"));
        townshipList.add(new TownshipModel("MMR014D001", "Taunggyi", "MMR014001", "တောင်ကြီး", "Taunggyi"));
        townshipList.add(new TownshipModel("MMR014D001", "Taunggyi", "MMR014007", "ရွာငံ", "Ywangan"));
        townshipList.add(new TownshipModel("MMR015D331", "Mong Maw (Wa SAD)", "MMR015311", "အိုက်ချန်", "Aik Chan (Ai' Chun)"));
        townshipList.add(new TownshipModel("MMR015D221", "Laukkaing (Kokang SAZ)", "MMR015203", "ချင်းရွှေဟော်မြို့နယ်ခွဲ (အထူးဒေသ ၁)", "Chinshwehaw Sub-township (Kokang SAZ)"));
        townshipList.add(new TownshipModel("MMR015D331", "Mong Maw (Wa SAD)", "MMR015306", "ခွန်းမား", "Hkun Mar (Hkwin Ma)"));
        townshipList.add(new TownshipModel("MMR015D006", "Hopang", "MMR015021", "ဟိုပန်", "Hopang"));
        townshipList.add(new TownshipModel("MMR015D331", "Mong Maw (Wa SAD)", "MMR015305", "ဆောင်ဖ", "Hsawng Hpa (Saun Pha)"));
        townshipList.add(new TownshipModel("MMR015D001", "Lashio", "MMR015002", "သိန်းနီ", "Hseni"));
        townshipList.add(new TownshipModel("MMR015D003", "Kyaukme", "MMR015014", "သီပေါ", "Hsipaw"));
        townshipList.add(new TownshipModel("MMR015D331", "Mong Maw (Wa SAD)", "MMR015310", "ကလောင်ဖါ", "Ka Lawng Hpar"));
        townshipList.add(new TownshipModel("MMR015D331", "Mong Maw (Wa SAD)", "MMR015304", "ကောင်မင်ဆန်း", "Kawng Min Hsang"));
        townshipList.add(new TownshipModel("MMR015D005", "Laukkaing", "MMR015023", "ကုန်းကြမ်း", "Konkyan"));
        townshipList.add(new TownshipModel("MMR015D221", "Laukkaing (Kokang SAZ)", "MMR015201", "ကုန်းကြမ်း (အထူးဒေသ ၁)", "Konkyan (Kokang SAZ)"));
        townshipList.add(new TownshipModel("MMR015D001", "Lashio", "MMR015020", "ကွမ်းလုံ", "Kunlong"));
        townshipList.add(new TownshipModel("MMR015D002", "Muse", "MMR015011", "ကွတ်ခိုင်", "Kutkai"));
        townshipList.add(new TownshipModel("MMR015D003", "Kyaukme", "MMR015012", "ကျောက်မဲ", "Kyaukme"));
        townshipList.add(new TownshipModel("MMR015D001", "Lashio", "MMR015001", "လားရှိုး", "Lashio"));
        townshipList.add(new TownshipModel("MMR015D005", "Laukkaing", "MMR015022", "လောက်ကိုင်", "Laukkaing"));
        townshipList.add(new TownshipModel("MMR015D221", "Laukkaing (Kokang SAZ)", "MMR015202", "လောက်ကိုင် (အထူးဒေသ ၁)", "Laukkaing (Kokang SAZ)"));
        townshipList.add(new TownshipModel("MMR015D331", "Mong Maw (Wa SAD)", "MMR015309", "လင်ဟော်", "Lin Haw"));
        townshipList.add(new TownshipModel("MMR015D331", "Mong Maw (Wa SAD)", "MMR015307", "လုံထန်", "Long Htan"));
        townshipList.add(new TownshipModel("MMR015D008", "Mongmit", "MMR015018", "မဘိမ်း", "Mabein"));
        townshipList.add(new TownshipModel("MMR015D332", "Wein Kawng (Wein Kao) (Wa SAD)", "MMR015313", "မန်မန်ဆိုင်", "Man Man Hseng"));
        townshipList.add(new TownshipModel("MMR015D331", "Mong Maw (Wa SAD)", "MMR015303", "မန်တွန်း", "Man Tun"));
        townshipList.add(new TownshipModel("MMR015D003", "Kyaukme", "MMR015019", "မန်တုန်", "Manton"));
        townshipList.add(new TownshipModel("MMR015D007", "Matman", "MMR015024", "မက်မန်း", "Matman"));
        townshipList.add(new TownshipModel("MMR015D006", "Hopang", "MMR015008", "မိုင်းမော", "Mongmao"));
        townshipList.add(new TownshipModel("MMR015D008", "Mongmit", "MMR015017", "မိုးမိတ်", "Mongmit"));
        townshipList.add(new TownshipModel("MMR015D001", "Lashio", "MMR015003", "မိုင်းရယ်", "Mongyai"));
        townshipList.add(new TownshipModel("MMR015D002", "Muse", "MMR015009", "မူဆယ်", "Muse"));
        townshipList.add(new TownshipModel("MMR015D332", "Wein Kawng (Wein Kao) (Wa SAD)", "MMR015315", "နမ်ခမ်းဝူး", "Nam Hkam Wu"));
        townshipList.add(new TownshipModel("MMR015D331", "Mong Maw (Wa SAD)", "MMR015301", "နမ့် တစ်", "Nam Tit"));
        townshipList.add(new TownshipModel("MMR015D002", "Muse", "MMR015010", "နမ့်ခမ်း", "Namhkan"));
        townshipList.add(new TownshipModel("MMR015D003", "Kyaukme", "MMR015016", "နမ့်ဆန်", "Namhsan"));
        townshipList.add(new TownshipModel("MMR015D003", "Kyaukme", "MMR015015", "နမ္မတူ", "Namtu"));
        townshipList.add(new TownshipModel("MMR015D332", "Wein Kawng (Wein Kao) (Wa SAD)", "MMR015316", "နားကောင်", "Nar Kawng"));
        townshipList.add(new TownshipModel("MMR015D331", "Mong Maw (Wa SAD)", "MMR015302", "နာဝီး", "Nar Wee (Na Wi)"));
        townshipList.add(new TownshipModel("MMR015D007", "Matman", "MMR015006", "နားဖန့်", "Narphan"));
        townshipList.add(new TownshipModel("MMR015D332", "Wein Kawng (Wein Kao) (Wa SAD)", "MMR015314", "နောင်ခစ်", "Nawng Hkit"));
        townshipList.add(new TownshipModel("MMR015D003", "Kyaukme", "MMR015013", "နောင်ချို", "Nawnghkio"));
        townshipList.add(new TownshipModel("MMR015D332", "Wein Kawng (Wein Kao) (Wa SAD)", "MMR015317", "ပန်ခမ့်", "Pang Hkam"));
        townshipList.add(new TownshipModel("MMR015D332", "Wein Kawng (Wein Kao) (Wa SAD)", "MMR015318", "ပန်ယန်း", "Pang Yang"));
        townshipList.add(new TownshipModel("MMR015D007", "Matman", "MMR015005", "ပန်ဆန်း", "Pangsang"));
        townshipList.add(new TownshipModel("MMR015D006", "Hopang", "MMR015007", "ပန်ဝိုင်း", "Pangwaun"));
        townshipList.add(new TownshipModel("MMR015D001", "Lashio", "MMR015004", "တန့်ယန်း", "Tangyan"));
        townshipList.add(new TownshipModel("MMR015D331", "Mong Maw (Wa SAD)", "MMR015308", "ယောင်လင်း", "Yawng Lin"));
        townshipList.add(new TownshipModel("MMR015D331", "Mong Maw (Wa SAD)", "MMR015312", "ရင်ဖန့်", "Yin Pang"));
        townshipList.add(new TownshipModel("MMR016D333", "Mong Pawk (Wa SAD)", "MMR016320", "ဟိုတောင်း", "Ho Tawng (Ho Tao)"));
        townshipList.add(new TownshipModel("MMR016D001", "Kengtung", "MMR016001", "ကျိုင်းတုံ", "Kengtung"));
        townshipList.add(new TownshipModel("MMR016D333", "Mong Pawk (Wa SAD)", "MMR016319", "မိုင်းဖျန်", "Mong Hpen"));
        townshipList.add(new TownshipModel("MMR016D333", "Mong Pawk (Wa SAD)", "MMR016322", "မိုင်းကာ", "Mong Kar"));
        townshipList.add(new TownshipModel("MMR016D333", "Mong Pawk (Wa SAD)", "MMR016321", "မိုင်းပေါက်", "Mong Pawk"));
        townshipList.add(new TownshipModel("MMR016D003", "Tachileik", "MMR016010", "မိုင်းဖြတ်", "Monghpyak"));
        townshipList.add(new TownshipModel("MMR016D002", "Monghsat", "MMR016006", "မိုင်းဆတ်", "Monghsat"));
        townshipList.add(new TownshipModel("MMR016D001", "Kengtung", "MMR016002", "မိုင်းခတ်", "Mongkhet"));
        townshipList.add(new TownshipModel("MMR016D001", "Kengtung", "MMR016005", "မိုင်းလား", "Mongla"));
        townshipList.add(new TownshipModel("MMR016D001", "Kengtung", "MMR016007", "မိုင်းပျင်း", "Mongping"));
        townshipList.add(new TownshipModel("MMR016D002", "Monghsat", "MMR016008", "မိုင်းတုံ", "Mongton"));
        townshipList.add(new TownshipModel("MMR016D001", "Kengtung", "MMR016003", "မိုင်းယန်း", "Mongyang"));
        townshipList.add(new TownshipModel("MMR016D003", "Tachileik", "MMR016011", "မိုင်းယောင်း", "Mongyawng"));
        townshipList.add(new TownshipModel("MMR016D333", "Mong Pawk (Wa SAD)", "MMR016323", "နမ့်ဖိုင်", "Nam Hpai"));
        townshipList.add(new TownshipModel("MMR016D003", "Tachileik", "MMR016009", "တာချီလိတ်", "Tachileik"));
        townshipList.add(new TownshipModel("MMR017D006", "Pyapon", "MMR017024", "ဘိုကလေး", "Bogale"));
        townshipList.add(new TownshipModel("MMR017D005", "Maubin", "MMR017022", "ဓနုဖြူ", "Danubyu"));
        townshipList.add(new TownshipModel("MMR017D006", "Pyapon", "MMR017026", "ဒေးဒရဲ", "Dedaye"));
        townshipList.add(new TownshipModel("MMR017D003", "Myaungmya", "MMR017015", "အိမ္မဲ", "Einme"));
        townshipList.add(new TownshipModel("MMR017D002", "Hinthada", "MMR017008", "ဟင်္သာတ", "Hinthada"));
        townshipList.add(new TownshipModel("MMR017D002", "Hinthada", "MMR017013", "အင်္ဂပူ", "Ingapu"));
        townshipList.add(new TownshipModel("MMR017D001", "Pathein", "MMR017002", "ကန်ကြီးထောင့်", "Kangyidaunt"));
        townshipList.add(new TownshipModel("MMR017D006", "Pyapon", "MMR017025", "ကျိုက်လတ်", "Kyaiklat"));
        townshipList.add(new TownshipModel("MMR017D002", "Hinthada", "MMR017012", "ကြံခင်း", "Kyangin"));
        townshipList.add(new TownshipModel("MMR017D001", "Pathein", "MMR017007", "ကျောင်းကုန်း", "Kyaunggon"));
        townshipList.add(new TownshipModel("MMR017D001", "Pathein", "MMR017005", "ကျုံပျော်", "Kyonpyaw"));
        townshipList.add(new TownshipModel("MMR017D004", "Labutta", "MMR017016", "လပွတ္တာ", "Labutta"));
        townshipList.add(new TownshipModel("MMR017D002", "Hinthada", "MMR017010", "လေးမျက်နှာ", "Lemyethna"));
        townshipList.add(new TownshipModel("MMR017D005", "Maubin", "MMR017019", "မအူပင်", "Maubin"));
        townshipList.add(new TownshipModel("MMR017D004", "Labutta", "MMR017018", "မော်လမြိုင်ကျွန်း", "Mawlamyinegyun"));
        townshipList.add(new TownshipModel("MMR017D002", "Hinthada", "MMR017011", "မြန်အောင်", "Myanaung"));
        townshipList.add(new TownshipModel("MMR017D003", "Myaungmya", "MMR017014", "မြောင်းမြ", "Myaungmya"));
        townshipList.add(new TownshipModel("MMR017D001", "Pathein", "MMR017004", "ငပုတော", "Ngapudaw"));
        townshipList.add(new TownshipModel("MMR017D005", "Maubin", "MMR017021", "ညောင်တုန်း", "Nyaungdon"));
        townshipList.add(new TownshipModel("MMR017D005", "Maubin", "MMR017020", "ပန်းတနော်", "Pantanaw"));
        townshipList.add(new TownshipModel("MMR017D001", "Pathein", "MMR017001", "ပုသိမ်", "Pathein"));
        townshipList.add(new TownshipModel("MMR017D006", "Pyapon", "MMR017023", "ဖျာပုံ", "Pyapon"));
        townshipList.add(new TownshipModel("MMR017D001", "Pathein", "MMR017003", "သာပေါင်း", "Thabaung"));
        townshipList.add(new TownshipModel("MMR017D003", "Myaungmya", "MMR017017", "ဝါးခယ်မ", "Wakema"));
        townshipList.add(new TownshipModel("MMR017D001", "Pathein", "MMR017006", "ရေကြည်", "Yegyi"));
        townshipList.add(new TownshipModel("MMR017D002", "Hinthada", "MMR017009", "ဇလွန်", "Zalun"));
        townshipList.add(new TownshipModel("MMR018D002", "Det Khi Na", "MMR018004", "ဒက္ခိဏသီရိ", "Det Khi Na Thi Ri"));
        townshipList.add(new TownshipModel("MMR018D002", "Det Khi Na", "MMR018007", "လယ်ဝေး", "Lewe"));
        townshipList.add(new TownshipModel("MMR018D001", "Oke Ta Ra", "MMR018008", "ဥတ္တရသီရိ", "Oke Ta Ra Thi Ri "));
        townshipList.add(new TownshipModel("MMR018D001", "Oke Ta Ra", "MMR018005", "ပုဗ္ဗသီရိ", "Poke Ba Thi Ri"));
        townshipList.add(new TownshipModel("MMR018D002", "Det Khi Na", "MMR018006", "ပျဉ်းမနား", "Pyinmana"));
        townshipList.add(new TownshipModel("MMR018D001", "Oke Ta Ra", "MMR018003", "တပ်ကုန်း", "Tatkon"));
        townshipList.add(new TownshipModel("MMR018D002", "Det Khi Na", "MMR018002", "ဇမ္ဗူသီရိ", "Za Bu Thi Ri"));
        townshipList.add(new TownshipModel("MMR018D001", "Oke Ta Ra", "MMR018001", "ဇေယျာသီရိ", "Zay Yar Thi Ri"));


        return townshipList;
    }
}