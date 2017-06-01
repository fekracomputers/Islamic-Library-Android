package com.fekracomputers.islamiclibrary.utility;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * بسم الله الرحمن الرحيم
 * Created by moda_ on 24/2/2017.
 */
public class ArabicUtilitiesTest {
    private final String full_page = "مُقَدّمَة\n" +
            "قَالَ الشَّيْخ الإِمَام الْعَالم الْعَلامَة الرباني حجَّة الْإِسْلَام رحْلَة الطالبين عُمْدَة الْمُحدثين زين الْمجَالِس فريد عصره ووحيد دهره محيي السّنة الغراء قامع أهل الْبدع والاهواء الشهَاب الثاقب أَبُو الْفضل أَحْمد بن عَليّ بن مُحَمَّد بن مُحَمَّد بن عَليّ الْعَسْقَلَانِي الشهير بِابْن حجر اثابه الله الْجنَّة بمنه وَكَرمه أَمِين الْحَمد لله الَّذِي شرح صُدُور أهل الْإِسْلَام للسّنة فانقادت لاتباعها وارتاحت لسماعها وامات نفوس أهل الطغيان بالبدعة بعد أَن تمادت فِي نزاعها وتغالت فِي ابتداعها وَأشْهد أَن لَا إِلَهَ إِلَّا اللَّهُ وَحْدَهُ لَا شَرِيكَ لَهُ الْعَالم بانقياد الافئدة وامتناعها المطلع على ضمائر الْقُلُوب فِي حالتي افتراقها واجتماعها وَأشْهد أَن مُحَمَّدًا عَبده وَرَسُوله الَّذِي انخفضت بِحقِّهِ كلمة الْبَاطِل بعد ارتفاعها واتصلت بإرساله أنوار الْهدى وَظَهَرت حجتها بعد انقطاعها صلى الله عَلَيْهِ وَسلم مَا دَامَت السَّمَاء وَالْأَرْض هَذِه فِي سَموهَا وَهَذِه فِي اتساعها وعَلى آله وَصَحبه الَّذين كسروا جيوش المردة وفتحوا حصون قلاعها وهجروا فِي محبَّة داعيهم إِلَى الله الاوطار والاوطان وَلم يعاودوها بعد وداعها وحفظوا على أتباعهم اقواله وافعاله واحواله حَتَّى أمنت بهم السّنَن الشَّرِيفَة من ضياعها أما بعد فَإِن أولى مَا صرفت فِيهِ نفائس الْأَيَّام وَأَعْلَى مَا خص بمزيد الاهتمام الِاشْتِغَال بالعلوم الشَّرْعِيَّة المتلقاة عَن خير الْبَريَّة وَلَا يرتاب عَاقل فِي أَن مدارها على كتاب الله المقتفى وَسنة نبيه الْمُصْطَفى وَأَن بَاقِي الْعُلُوم أما الات لفهمهما وَهِي الضَّالة الْمَطْلُوبَة أَو أَجْنَبِيَّة عَنْهُمَا وَهِي الضارة المغلوبة وَقد رَأَيْت الإِمَام أَبَا عبد الله البُخَارِيّ فِي جَامعه الصَّحِيح قد تصدى للاقتباس من انوارهما البهية تقريرا واستنباطا وكرع من مناهلهما الروية انتزاعا وانتشاطا ورزق بِحسن نِيَّته السَّعَادَة فِيمَا جمع حَتَّى اذعن لَهُ الْمُخَالف والموافق وتلقى كَلَامه فِي التَّصْحِيح بِالتَّسْلِيمِ المطاوع والمفارق وَقد استخرت الله تَعَالَى فِي أَن أضم إِلَيْهِ نبذا شارحة لفوائده مُوضحَة لمقاصده كاشفة عَن مغزاه فِي تَقْيِيد اوابده واقتناص شوارده وأقدم بَين يَدي ذَلِك كُله مُقَدّمَة فِي تَبْيِين قَوَاعِده وتزيين فرائده جَامِعَة وجيزة دون الاسهاب وَفَوق الْقُصُور سهلة المأخذ تفتح المستغلق وتذلل الصعاب وتشرح الصُّدُور وينحصر القَوْل فِيهَا إِن شَاءَ الله تَعَالَى فِي عشرَة فُصُول الأول فِي بَيَان السَّبَب الْبَاعِث لَهُ على تصنيف هَذَا الْكتاب الثَّانِي فِي بَيَان مَوْضُوعه والكشف عَن مغزاه فِيهِ وَالْكَلَام على تَحْقِيق شُرُوطه وَتَقْرِير كَونه من أصح الْكتب المصنفة فِي الحَدِيث النَّبَوِيّ ويلتحق بِهِ الْكَلَام على تراجمه البديعة المنال المنيعة الْمِثَال الَّتِي انْفَرد بتدقيقه فِيهَا عَن نظرائه واشتهر بتحقيقه لَهَا عَن قرنائه";

    @Test
    public void cleanTextForSearchingWithRegex() throws Exception {

    }

    @Test
    public void checkStringBuilderAndRegexGivesTheSameResults() {
        assertEquals(ArabicUtilities.cleanTextForSearchingWithRegex(full_page), ArabicUtilities.cleanTextForSearchingWthStingBuilder(full_page));
    }

    @Test
    public void checkForTaMarbouta() {
        assertEquals("الصلاه", ArabicUtilities.cleanTextForSearchingWithRegex("الصلاة"));
    }

    @Test
    public void cleanTextForSearchingWthStingBuilder() throws Exception {

    }

    @Test
    public void prepareForPreAppendLam() throws Exception {
        assertEquals("ل" + ArabicUtilities.prepareForPrefixingLam("البخاري"), "للبخاري");
        assertEquals("ل" + ArabicUtilities.prepareForPrefixingLam("محمد"), "لمحمد");
        assertEquals("ل" + ArabicUtilities.prepareForPrefixingLam("اللبن"), "للبن");
        assertEquals("ل" + ArabicUtilities.prepareForPrefixingLam("اللحم"), "للحم");
        assertEquals("ل" + ArabicUtilities.prepareForPrefixingLam("الله"), "لله");
        assertEquals("ل" + ArabicUtilities.prepareForPrefixingLam("أبو بكر"), "لأبي بكر");
    }

    @Test
    public void startsWithDefiniteArticle() throws Exception {
        assertEquals(ArabicUtilities.startsWithDefiniteArticle("البخاري"), true);
        assertEquals(ArabicUtilities.startsWithDefiniteArticle("اللبن"), true);
        assertEquals(ArabicUtilities.startsWithDefiniteArticle("اللحم"), true);

    }

    @Test
    public void cleanTextForSearching2() throws Exception {
        String s = "";
        for (int i = 0; i < 10000; i++)
            s = ArabicUtilities.cleanTextForSearchingWthStingBuilder(full_page);
        assertEquals("مقدمه\n" +
                        "قال الشيخ الامام العالم العلامه الرباني حجه الاسلام رحله الطالبين عمده المحدثين زين المجالس فريد عصره ووحيد دهره محيي السنه الغراء قامع اهل البدع والاهواء الشهاب الثاقب ابو الفضل احمد بن علي بن محمد بن محمد بن علي العسقلاني الشهير بابن حجر اثابه الله الجنه بمنه وكرمه امين الحمد لله الذي شرح صدور اهل الاسلام للسنه فانقادت لاتباعها وارتاحت لسماعها وامات نفوس اهل الطغيان بالبدعه بعد ان تمادت في نزاعها وتغالت في ابتداعها واشهد ان لا اله الا الله وحده لا شريك له العالم بانقياد الافئده وامتناعها المطلع علي ضمائر القلوب في حالتي افتراقها واجتماعها واشهد ان محمدا عبده ورسوله الذي انخفضت بحقه كلمه الباطل بعد ارتفاعها واتصلت بارساله انوار الهدي وظهرت حجتها بعد انقطاعها صلي الله عليه وسلم ما دامت السماء والارض هذه في سموها وهذه في اتساعها وعلي اله وصحبه الذين كسروا جيوش المرده وفتحوا حصون قلاعها وهجروا في محبه داعيهم الي الله الاوطار والاوطان ولم يعاودوها بعد وداعها وحفظوا علي اتباعهم اقواله وافعاله واحواله حتي امنت بهم السنن الشريفه من ضياعها اما بعد فان اولي ما صرفت فيه نفائس الايام واعلي ما خص بمزيد الاهتمام الاشتغال بالعلوم الشرعيه المتلقاه عن خير البريه ولا يرتاب عاقل في ان مدارها علي كتاب الله المقتفي وسنه نبيه المصطفي وان باقي العلوم اما الات لفهمهما وهي الضاله المطلوبه او اجنبيه عنهما وهي الضاره المغلوبه وقد رايت الامام ابا عبد الله البخاري في جامعه الصحيح قد تصدي للاقتباس من انوارهما البهيه تقريرا واستنباطا وكرع من مناهلهما الرويه انتزاعا وانتشاطا ورزق بحسن نيته السعاده فيما جمع حتي اذعن له المخالف والموافق وتلقي كلامه في التصحيح بالتسليم المطاوع والمفارق وقد استخرت الله تعالي في ان اضم اليه نبذا شارحه لفوائده موضحه لمقاصده كاشفه عن مغزاه في تقييد اوابده واقتناص شوارده واقدم بين يدي ذلك كله مقدمه في تبيين قواعده وتزيين فرائده جامعه وجيزه دون الاسهاب وفوق القصور سهله الماخذ تفتح المستغلق وتذلل الصعاب وتشرح الصدور وينحصر القول فيها ان شاء الله تعالي في عشره فصول الاول في بيان السبب الباعث له علي تصنيف هذا الكتاب الثاني في بيان موضوعه والكشف عن مغزاه فيه والكلام علي تحقيق شروطه وتقرير كونه من اصح الكتب المصنفه في الحديث النبوي ويلتحق به الكلام علي تراجمه البديعه المنال المنيعه المثال التي انفرد بتدقيقه فيها عن نظرائه واشتهر بتحقيقه لها عن قرنائه",
                s
        );
    }


    @Test
    public void cleanTextForSearching() throws Exception {
        String s = "";
        for (int i = 0; i < 10000; i++)
            s = ArabicUtilities.cleanTextForSearchingWithRegex(full_page);
        assertEquals("مقدمه\n" +
                        "قال الشيخ الامام العالم العلامه الرباني حجه الاسلام رحله الطالبين عمده المحدثين زين المجالس فريد عصره ووحيد دهره محيي السنه الغراء قامع اهل البدع والاهواء الشهاب الثاقب ابو الفضل احمد بن علي بن محمد بن محمد بن علي العسقلاني الشهير بابن حجر اثابه الله الجنه بمنه وكرمه امين الحمد لله الذي شرح صدور اهل الاسلام للسنه فانقادت لاتباعها وارتاحت لسماعها وامات نفوس اهل الطغيان بالبدعه بعد ان تمادت في نزاعها وتغالت في ابتداعها واشهد ان لا اله الا الله وحده لا شريك له العالم بانقياد الافئده وامتناعها المطلع علي ضمائر القلوب في حالتي افتراقها واجتماعها واشهد ان محمدا عبده ورسوله الذي انخفضت بحقه كلمه الباطل بعد ارتفاعها واتصلت بارساله انوار الهدي وظهرت حجتها بعد انقطاعها صلي الله عليه وسلم ما دامت السماء والارض هذه في سموها وهذه في اتساعها وعلي اله وصحبه الذين كسروا جيوش المرده وفتحوا حصون قلاعها وهجروا في محبه داعيهم الي الله الاوطار والاوطان ولم يعاودوها بعد وداعها وحفظوا علي اتباعهم اقواله وافعاله واحواله حتي امنت بهم السنن الشريفه من ضياعها اما بعد فان اولي ما صرفت فيه نفائس الايام واعلي ما خص بمزيد الاهتمام الاشتغال بالعلوم الشرعيه المتلقاه عن خير البريه ولا يرتاب عاقل في ان مدارها علي كتاب الله المقتفي وسنه نبيه المصطفي وان باقي العلوم اما الات لفهمهما وهي الضاله المطلوبه او اجنبيه عنهما وهي الضاره المغلوبه وقد رايت الامام ابا عبد الله البخاري في جامعه الصحيح قد تصدي للاقتباس من انوارهما البهيه تقريرا واستنباطا وكرع من مناهلهما الرويه انتزاعا وانتشاطا ورزق بحسن نيته السعاده فيما جمع حتي اذعن له المخالف والموافق وتلقي كلامه في التصحيح بالتسليم المطاوع والمفارق وقد استخرت الله تعالي في ان اضم اليه نبذا شارحه لفوائده موضحه لمقاصده كاشفه عن مغزاه في تقييد اوابده واقتناص شوارده واقدم بين يدي ذلك كله مقدمه في تبيين قواعده وتزيين فرائده جامعه وجيزه دون الاسهاب وفوق القصور سهله الماخذ تفتح المستغلق وتذلل الصعاب وتشرح الصدور وينحصر القول فيها ان شاء الله تعالي في عشره فصول الاول في بيان السبب الباعث له علي تصنيف هذا الكتاب الثاني في بيان موضوعه والكشف عن مغزاه فيه والكلام علي تحقيق شروطه وتقرير كونه من اصح الكتب المصنفه في الحديث النبوي ويلتحق به الكلام علي تراجمه البديعه المنال المنيعه المثال التي انفرد بتدقيقه فيها عن نظرائه واشتهر بتحقيقه لها عن قرنائه",
                s
        );

    }

    @Test
    public void cleanTextForSearchingCorrectness() throws Exception {
        assertEquals(ArabicUtilities.cleanTextForSearchingWithRegex(full_page), ArabicUtilities.cleanTextForSearchingWthStingBuilder(full_page));
        String testString = "مُقَدّمَة\n" +
                "قَالَ الشَّيْخ الإِمَام الْعَالم الْعَلامَة الرباني حجَّة الْإِسْلَامِ";
        assertEquals(ArabicUtilities.cleanTextForSearchingWithRegex(testString), ArabicUtilities.cleanTextForSearchingWthStingBuilder(testString));
        String page_with_comments = "<p>معروضةٍ في المسجدِ، فكلِّم على قصر الصلاة، فكانت منه مراجعة، وفي بعض الروايات أنه دخل إلى بعض حجره <a class=\"comment\" title=\"&#1602;&#1608;&#1604;&#1607;&#58;&#32;&#40;&#1608;&#1601;&#1610;&#32;&#1576;&#1593;&#1590;&#32;&#1575;&#1604;&#1585;&#1608;&#1575;&#1610;&#1575;&#1578;&#32;&#1571;&#1606;&#1607;&#32;&#1583;&#1582;&#1604;&#32;&#1573;&#1604;&#1609;&#32;&#1576;&#1593;&#1590;&#32;&#1581;&#1580;&#1585;&#1607;&#41;&#32;&#1587;&#1575;&#1602;&#1591;&#32;&#1605;&#1606;&#32;&#40;&#1576;&#41;&#32;&#1608;&#32;&#40;&#1588;&#32;&#49;&#41;&#46;\">(?)</a>، ثم بنا على ما تقدم، من صلاته <a class=\"comment\" title=\"&#1602;&#1608;&#1604;&#1607;&#58;&#32;&#40;&#1605;&#1606;&#32;&#1589;&#1604;&#1575;&#1578;&#1607;&#41;&#32;&#1586;&#1610;&#1575;&#1583;&#1577;&#32;&#1601;&#1610;&#32;&#40;&#1602;&#32;&#49;&#48;&#41;&#46;&#10;&#1602;&#1604;&#1578;&#58;&#32;&#1608;&#1575;&#1604;&#1605;&#1572;&#1604;&#1601;&#32;&#1610;&#1588;&#1610;&#1585;&#32;&#1573;&#1604;&#1609;&#32;&#1581;&#1583;&#1610;&#1579;&#32;&#1571;&#1576;&#1610;&#32;&#1607;&#1585;&#1610;&#1585;&#1577;&#32;&#45;&#32;&#1585;&#1590;&#1610;&#32;&#1575;&#1604;&#1604;&#1607;&#32;&#1593;&#1606;&#1607;&#32;&#45;&#58;&#32;&#1571;&#1606;&#32;&#1585;&#1587;&#1608;&#1604;&#32;&#1575;&#1604;&#1604;&#1607;&#32;&#45;&#32;&#1589;&#1604;&#1609;&#32;&#1575;&#1604;&#1604;&#1607;&#32;&#1593;&#1604;&#1610;&#1607;&#32;&#1608;&#1587;&#1604;&#1605;&#32;&#45;&#32;&#1575;&#1606;&#1589;&#1585;&#1601;&#32;&#1605;&#1606;&#32;&#1575;&#1579;&#1606;&#1578;&#1610;&#1606;&#1548;&#32;&#1601;&#1602;&#1575;&#1604;&#32;&#1604;&#1607;&#32;&#1584;&#1608;&#32;&#1575;&#1604;&#1610;&#1583;&#1610;&#1606;&#58;&#32;&#1571;&#1602;&#1589;&#1585;&#1578;&#32;&#1575;&#1604;&#1589;&#1604;&#1575;&#1577;&#32;&#1571;&#1605;&#32;&#1606;&#1587;&#1610;&#1578;&#32;&#1610;&#1575;&#32;&#1585;&#1587;&#1608;&#1604;&#32;&#1575;&#1604;&#1604;&#1607;&#1567;&#32;&#1601;&#1602;&#1575;&#1604;&#32;&#1585;&#1587;&#1608;&#1604;&#32;&#1575;&#1604;&#1604;&#1607;&#32;&#45;&#32;&#1589;&#1604;&#1609;&#32;&#1575;&#1604;&#1604;&#1607;&#32;&#1593;&#1604;&#1610;&#1607;&#32;&#1608;&#1587;&#1604;&#1605;&#32;&#45;&#58;&#32;&#40;&#1571;&#1589;&#1583;&#1602;&#32;&#1584;&#1608;&#32;&#1575;&#1604;&#1610;&#1583;&#1610;&#1606;&#41;&#32;&#1601;&#1602;&#1575;&#1604;&#32;&#1575;&#1604;&#1606;&#1575;&#1587;&#58;&#32;&#1606;&#1593;&#1605;&#32;&#1601;&#1602;&#1575;&#1605;&#32;&#1585;&#1587;&#1608;&#1604;&#32;&#1575;&#1604;&#1604;&#1607;&#32;&#45;&#32;&#1589;&#1604;&#1609;&#32;&#1575;&#1604;&#1604;&#1607;&#32;&#1593;&#1604;&#1610;&#1607;&#32;&#1608;&#1587;&#1604;&#1605;&#32;&#45;&#32;&#1601;&#1589;&#1604;&#1609;&#32;&#1585;&#1603;&#1593;&#1578;&#1610;&#1606;&#32;&#1571;&#1582;&#1585;&#1610;&#1610;&#1606;&#32;&#1579;&#1605;&#32;&#1587;&#1604;&#1605;&#1548;&#32;&#1579;&#1605;&#32;&#1603;&#1576;&#1610;&#1585;&#32;&#1601;&#1587;&#1580;&#1583;&#32;&#1605;&#1579;&#1604;&#32;&#1587;&#1580;&#1608;&#1583;&#1607;&#32;&#1571;&#1608;&#32;&#1571;&#1591;&#1608;&#1604;&#1548;&#32;&#1579;&#1605;&#32;&#1585;&#1601;&#1593;&#32;&#1579;&#1605;&#32;&#1603;&#1576;&#1610;&#1585;&#32;&#1601;&#1587;&#1580;&#1583;&#32;&#1605;&#1579;&#1604;&#32;&#1587;&#1580;&#1608;&#1583;&#1607;&#32;&#1571;&#1608;&#32;&#1571;&#1591;&#1608;&#1604;&#32;&#1579;&#1605;&#32;&#1585;&#1601;&#1593;&#46;&#32;&#1608;&#1602;&#1583;&#32;&#1587;&#1576;&#1602;&#32;&#1578;&#1582;&#1585;&#1610;&#1580;&#1607;&#32;&#1601;&#1610;&#32;&#1603;&#1578;&#1575;&#1576;&#32;&#1575;&#1604;&#1589;&#1604;&#1575;&#1577;&#32;&#1575;&#1604;&#1571;&#1608;&#1604;&#1548;&#32;&#1589;&#58;&#32;&#51;&#57;&#53;&#46;\">(?)</a>، وأما إن جهل فابتدأ الصوم في ذي القعدة وذي الحجة، فالصواب أن يبتدئ، بخلاف الناسي <a class=\"comment\" title=\"&#1601;&#1610;&#32;&#40;&#1602;&#32;&#49;&#48;&#41;&#58;&#32;&#40;&#1608;&#1604;&#1610;&#1587;&#32;&#1603;&#1575;&#1604;&#1606;&#1575;&#1587;&#1610;&#41;&#46;\">(?)</a>؛ لأنَّ هذا متعمد، أو لو جهل رجل أعداد الصلاة وظنَّ أن الظهر ركعتان، فصلاها على ذلك <a class=\"comment\" title=\"&#1602;&#1608;&#1604;&#1607;&#58;&#32;&#40;&#1601;&#1589;&#1604;&#1575;&#1607;&#1575;&#32;&#1593;&#1604;&#1609;&#32;&#1584;&#1604;&#1603;&#41;&#32;&#1586;&#1610;&#1575;&#1583;&#1577;&#32;&#1601;&#1610;&#32;&#40;&#1602;&#32;&#49;&#48;&#41;&#46;\">(?)</a> فلما سلَّم وتكلم أُعْلِمَ أنها <a class=\"comment\" title=\"&#1601;&#1610;&#32;&#40;&#1602;&#32;&#49;&#48;&#41;&#58;&#32;&#40;&#1571;&#1606;&#32;&#1575;&#1604;&#1592;&#1607;&#1585;&#41;&#46;\">(?)</a> أربع- لم يجزئه أن يبني على ما صلى أربعًا <a class=\"comment\" title=\"&#1602;&#1608;&#1604;&#1607;&#58;&#32;&#40;&#1571;&#1585;&#1576;&#1593;&#1611;&#1575;&#41;&#32;&#1587;&#1575;&#1602;&#1591;&#32;&#1605;&#1606;&#32;&#40;&#1576;&#41;&#32;&#1608;&#32;&#40;&#1588;&#32;&#49;&#41;&#46;\">(?)</a>.</p>\n" +
                "<p>ولو ابتدأ صيامه في شوال، ثم مرض ذا القعدة، ثم صح ذا الحجة- أجزأه أن يبني على ما تقدم؛ لأن المرض أخره إلى ذي الحجة.</p>\n" +
                "<p>وقال ابن القاسم في العتبية فيمن صام عن ظهارين فواصل أربعة أشهر، ثم ذكر يومين لا يدري من أي ظهاريه، صام يومين يصلهما <a class=\"comment\" title=\"&#1602;&#1608;&#1604;&#1607;&#58;&#32;&#40;&#1610;&#1589;&#1604;&#1607;&#1605;&#1575;&#41;&#32;&#1587;&#1575;&#1602;&#1591;&#32;&#1605;&#1606;&#32;&#40;&#1588;&#32;&#49;&#41;&#46;\">(?)</a>، وأتى بشهرين <a class=\"comment\" title=\"&#1575;&#1606;&#1592;&#1585;&#58;&#32;&#1575;&#1604;&#1576;&#1610;&#1575;&#1606;&#32;&#1608;&#1575;&#1604;&#1578;&#1581;&#1589;&#1610;&#1604;&#58;&#32;&#53;&#47;&#32;&#49;&#57;&#51;&#46;&#32;&#1608;&#1575;&#1604;&#1606;&#1608;&#1575;&#1583;&#1585;&#32;&#1608;&#1575;&#1604;&#1586;&#1610;&#1575;&#1583;&#1575;&#1578;&#58;&#32;&#50;&#47;&#32;&#54;&#48;\">(?)</a>.</p>\n";
        assertEquals(ArabicUtilities.cleanTextForSearchingWithRegex(page_with_comments), ArabicUtilities.cleanTextForSearchingWthStingBuilder(page_with_comments));


    }


}