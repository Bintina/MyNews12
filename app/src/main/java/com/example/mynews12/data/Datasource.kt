package com.example.mynews12.data

import com.example.mynews12.model.topnews.NewsResponse
import com.example.mynews12.model.topnews.NewsResult

object Datasource {

    fun loadNews(): List<NewsResult> {
        return listOf<NewsResult>(
            NewsResult(

                 "In an apparent break with Pentagon advice, Oleksandr Syrsky, Ukraine’s top general in the east, called for “all measures” to defend an area where Russia was threatening to take more territory.",
                "By Thomas Gibbons-Neff",
                "2023-08-26T06:29:09-04:00",
                ["Russian Invasion of Ukraine (2022)",
                "Defense and Military Forces",
                "United States Defense and Military Forces"],

                "section": "world",
                "subsection": "europe",
                "title": "Ukrainian Commander Urges More Defenses in the Northeast",
                "url": "https://www.nytimes.com/2023/08/26/world/europe/russia-ukraine-war-counteroffensive.html",
                "uri": "nyt://article/f092639b-b475-550c-bc87-c808f0b31fc0",
                "item_type": "Article",
                "updated_date": "2023-08-26T21:35:56-04:00",
                "published_date": "2023-08-26T06:29:09-04:00",
                "material_type_facet": "",
                "kicker": "",
                "org_facet": [
                "Defense Department"
                ],
                "per_facet": [
                "Prigozhin, Yevgeny V",
                "Putin, Vladimir V",
                "Oleksandr Syrsky",
                "Zelensky, Volodymyr"
                ],
                "geo_facet": [
                "Russia",
                "Moscow (Russia)"
                ],
                "multimedia": [
                {
                    "url": "https://static01.nyt.com/images/2023/08/26/multimedia/26ukraine-ledeall-01-mlvq/26ukraine-ledeall-01-mlvq-superJumbo.jpg",
                    "format": "Super Jumbo",
                    "height": 1463,
                    "width": 2048,
                    "type": "image",
                    "subtype": "photo",
                    "caption": "A destroyed tank on a street in Kupiansk, in northeastern Ukraine, this month. Russian forces have managed to push forward around the city in recent weeks.",
                    "copyright": "Emile Ducke for The New York Times"
            ),

                {
                    "url": "https://static01.nyt.com/images/2023/08/26/multimedia/26ukraine-ledeall-01-mlvq/26ukraine-ledeall-01-mlvq-threeByTwoSmallAt2X.jpg",
                    "format": "threeByTwoSmallAt2X",
                    "height": 400,
                    "width": 600,
                    "type": "image",
                    "subtype": "photo",
                    "caption": "A destroyed tank on a street in Kupiansk, in northeastern Ukraine, this month. Russian forces have managed to push forward around the city in recent weeks.",
                    "copyright": "Emile Ducke for The New York Times"
                },
                {
                    "url": "https://static01.nyt.com/images/2023/08/26/multimedia/26ukraine-ledeall-01-mlvq/26ukraine-ledeall-01-mlvq-thumbLarge.jpg",
                    "format": "Large Thumbnail",
                    "height": 150,
                    "width": 150,
                    "type": "image",
                    "subtype": "photo",
                    "caption": "A destroyed tank on a street in Kupiansk, in northeastern Ukraine, this month. Russian forces have managed to push forward around the city in recent weeks.",
                    "copyright": "Emile Ducke for The New York Times"
                }
                ],
                "short_url": "https://nyti.ms/47GEpng"
            },
            {
                "section": "world",
                "subsection": "middleeast",
                "title": "U.S. Knew Saudis Were Killing African Migrants",
                "abstract": "The United States was told last year that Saudi security forces were shooting, shelling and abusing groups of migrants, but it chose not to raise the issue publicly.",
                "url": "https://www.nytimes.com/2023/08/26/world/middleeast/saudi-killing-migrants-yemen.html",
                "uri": "nyt://article/55b22270-cfe0-51b1-bd38-2541d6663fae",
                "byline": "By Ben Hubbard and Edward Wong",
                "item_type": "Article",
                "updated_date": "2023-08-26T21:05:17-04:00",
                "created_date": "2023-08-26T14:57:01-04:00",
                "published_date": "2023-08-26T14:57:01-04:00",
                "material_type_facet": "",
                "kicker": "",
                "des_facet": [
                "Illegal Immigration",
                "Human Rights and Human Rights Violations",
                "War Crimes, Genocide and Crimes Against Humanity"
                ],
                "org_facet": [
                "Human Rights Watch",
                "United Nations"
                ],
                "per_facet": [
                "Biden, Joseph R Jr"
                ],
                "geo_facet": [
                "Aden (Yemen)",
                "Ethiopia",
                "Europe",
                "Saudi Arabia",
                "Yemen",
                "United States"
                ],
                "multimedia": [
                {
                    "url": "https://static01.nyt.com/images/2023/08/26/multimedia/26Yemen-kjgf/26Yemen-kjgf-superJumbo.jpg",
                    "format": "Super Jumbo",
                    "height": 1365,
                    "width": 2048,
                    "type": "image",
                    "subtype": "photo",
                    "caption": "Ethiopian migrants on the outskirts of the Yemeni capital of Sana heading for the Saudi Arabian border, where some have faced violence at the hands of Saudi border guards.",
                    "copyright": "Mohammed Hamoud/Getty Images"
                },
                {
                    "url": "https://static01.nyt.com/images/2023/08/26/multimedia/26Yemen-kjgf/26Yemen-kjgf-threeByTwoSmallAt2X.jpg",
                    "format": "threeByTwoSmallAt2X",
                    "height": 400,
                    "width": 600,
                    "type": "image",
                    "subtype": "photo",
                    "caption": "Ethiopian migrants on the outskirts of the Yemeni capital of Sana heading for the Saudi Arabian border, where some have faced violence at the hands of Saudi border guards.",
                    "copyright": "Mohammed Hamoud/Getty Images"
                },
                {
                    "url": "https://static01.nyt.com/images/2023/08/26/multimedia/26Yemen-kjgf/26Yemen-kjgf-thumbLarge.jpg",
                    "format": "Large Thumbnail",
                    "height": 150,
                    "width": 150,
                    "type": "image",
                    "subtype": "photo",
                    "caption": "Ethiopian migrants on the outskirts of the Yemeni capital of Sana heading for the Saudi Arabian border, where some have faced violence at the hands of Saudi border guards.",
                    "copyright": "Mohammed Hamoud/Getty Images"
                }
                ],
                "short_url": "https://nyti.ms/3OKkDOY"
            },
            {
                "section": "world",
                "subsection": "africa",
                "title": "Incumbent Claims Victory in Zimbabwe Election Amid Fraud Accusations",
                "abstract": "President Emmerson Mnangagwa won another five-year term, but did so by intimidating voters and manipulating the campaign process, the opposition says.",
                "url": "https://www.nytimes.com/2023/08/26/world/africa/zimbabwe-election-mnangagwa-wins.html",
                "uri": "nyt://article/9b3a39a8-709a-5f64-b162-07582e6b52d8",
                "byline": "By John Eligon",
                "item_type": "Article",
                "updated_date": "2023-08-26T21:56:27-04:00",
                "created_date": "2023-08-26T17:35:49-04:00",
                "published_date": "2023-08-26T17:35:49-04:00",
                "material_type_facet": "",
                "kicker": "",
                "des_facet": [
                "Voter Fraud (Election Fraud)",
                "Politics and Government"
                ],
                "org_facet": [
                "Citizens Coalition for Change (Zimbabwean Political Party)",
                "Zimbabwe African National Union-Patriotic Front (ZANU-PF)"
                ],
                "per_facet": [
                "Chamisa, Nelson",
                "Mnangagwa, Emmerson"
                ],
                "geo_facet": [
                "Zimbabwe"
                ],
                "multimedia": [
                {
                    "url": "https://static01.nyt.com/images/2023/08/24/multimedia/00ZIMBABWE-ELECTION-HFO-vjhg/00ZIMBABWE-ELECTION-HFO-vjhg-superJumbo.jpg",
                    "format": "Super Jumbo",
                    "height": 1350,
                    "width": 2048,
                    "type": "image",
                    "subtype": "photo",
                    "caption": "President Emmerson Mnangagwa at a campaign rally in Harare, Zimbabwe, this month. The country has a history of election irregularities.",
                    "copyright": "Tsvangirayi Mukwazhi/Associated Press"
                },
                {
                    "url": "https://static01.nyt.com/images/2023/08/24/multimedia/00ZIMBABWE-ELECTION-HFO-vjhg/00ZIMBABWE-ELECTION-HFO-vjhg-threeByTwoSmallAt2X.jpg",
                    "format": "threeByTwoSmallAt2X",
                    "height": 400,
                    "width": 600,
                    "type": "image",
                    "subtype": "photo",
                    "caption": "President Emmerson Mnangagwa at a campaign rally in Harare, Zimbabwe, this month. The country has a history of election irregularities.",
                    "copyright": "Tsvangirayi Mukwazhi/Associated Press"
                },
                {
                    "url": "https://static01.nyt.com/images/2023/08/24/multimedia/00ZIMBABWE-ELECTION-HFO-vjhg/00ZIMBABWE-ELECTION-HFO-vjhg-thumbLarge.jpg",
                    "format": "Large Thumbnail",
                    "height": 150,
                    "width": 150,
                    "type": "image",
                    "subtype": "photo",
                    "caption": "President Emmerson Mnangagwa at a campaign rally in Harare, Zimbabwe, this month. The country has a history of election irregularities.",
                    "copyright": "Tsvangirayi Mukwazhi/Associated Press"
                }
                ],
                "short_url": "https://nyti.ms/3Pdod5D"
            },
            {
                "section": "world",
                "subsection": "europe",
                "title": "At This Movie, Their Phones Won’t Bother You. Their Barking Might.",
                "abstract": "A cinema chain in Britain is welcoming dogs to select screenings. They don’t need their own tickets, and they don’t need to turn off their cellphones.",
                "url": "https://www.nytimes.com/2023/08/26/world/europe/curzon-cinema-dogs-screenings.html",
                "uri": "nyt://article/928d4715-a2fe-506e-8f67-5bb91cef7e0f",
                "byline": "By Derrick Bryson Taylor",
                "item_type": "Article",
                "updated_date": "2023-08-26T11:41:36-04:00",
                "created_date": "2023-08-26T06:04:41-04:00",
                "published_date": "2023-08-26T06:04:41-04:00",
                "material_type_facet": "",
                "kicker": "",
                "des_facet": [
                "Movies",
                "Pets",
                "Dogs"
                ],
                "org_facet": [],
                "per_facet": [],
                "geo_facet": [
                "Great Britain",
                "London (England)"
                ],
                "multimedia": [
                {
                    "url": "https://static01.nyt.com/images/2023/08/23/multimedia/00xp-cinemadogs-mjph/00xp-cinemadogs-mjph-superJumbo.jpg",
                    "format": "Super Jumbo",
                    "height": 1366,
                    "width": 2048,
                    "type": "image",
                    "subtype": "photo",
                    "caption": "Damian and Catriona Spandley, with their dogs Lucky and Jeff, attending a screening of the movie “Strays” at the Curzon Aldgate cinema in London on Saturday. Mr. Spandley is a Curzon employee.",
                    "copyright": "Mary Turner for The New York Times"
                },
                {
                    "url": "https://static01.nyt.com/images/2023/08/23/multimedia/00xp-cinemadogs-mjph/00xp-cinemadogs-mjph-threeByTwoSmallAt2X.jpg",
                    "format": "threeByTwoSmallAt2X",
                    "height": 400,
                    "width": 600,
                    "type": "image",
                    "subtype": "photo",
                    "caption": "Damian and Catriona Spandley, with their dogs Lucky and Jeff, attending a screening of the movie “Strays” at the Curzon Aldgate cinema in London on Saturday. Mr. Spandley is a Curzon employee.",
                    "copyright": "Mary Turner for The New York Times"
                },
                {
                    "url": "https://static01.nyt.com/images/2023/08/23/multimedia/00xp-cinemadogs-mjph/00xp-cinemadogs-mjph-thumbLarge.jpg",
                    "format": "Large Thumbnail",
                    "height": 150,
                    "width": 150,
                    "type": "image",
                    "subtype": "photo",
                    "caption": "Damian and Catriona Spandley, with their dogs Lucky and Jeff, attending a screening of the movie “Strays” at the Curzon Aldgate cinema in London on Saturday. Mr. Spandley is a Curzon employee.",
                    "copyright": "Mary Turner for The New York Times"
                }

                )
    }
}

/*
{
 "status": "OK",
 "copyright": "Copyright (c) 2023 The New York Times Company. All Rights Reserved.",
 "section": "World News",
 "last_updated": "2023-08-26T20:05:47-04:00",
 "num_results": 38,
 "results": [
 {
     "section": "world",
     "subsection": "europe",
     "title": "Ukrainian Commander Urges More Defenses in the Northeast",
     "abstract": "In an apparent break with Pentagon advice, Oleksandr Syrsky, Ukraine’s top general in the east, called for “all measures” to defend an area where Russia was threatening to take more territory.",
     "url": "https://www.nytimes.com/2023/08/26/world/europe/russia-ukraine-war-counteroffensive.html",
     "uri": "nyt://article/f092639b-b475-550c-bc87-c808f0b31fc0",
     "byline": "By Thomas Gibbons-Neff",
     "item_type": "Article",
     "updated_date": "2023-08-26T21:35:56-04:00",
     "created_date": "2023-08-26T06:29:09-04:00",
     "published_date": "2023-08-26T06:29:09-04:00",
     "material_type_facet": "",
     "kicker": "",
     "des_facet": [
     "Russian Invasion of Ukraine (2022)",
     "Defense and Military Forces",
     "United States Defense and Military Forces"
     ],
     "org_facet": [
     "Defense Department"
     ],
     "per_facet": [
     "Prigozhin, Yevgeny V",
     "Putin, Vladimir V",
     "Oleksandr Syrsky",
     "Zelensky, Volodymyr"
     ],
     "geo_facet": [
     "Russia",
     "Moscow (Russia)"
     ],
     "multimedia": [
     {
         "url": "https://static01.nyt.com/images/2023/08/26/multimedia/26ukraine-ledeall-01-mlvq/26ukraine-ledeall-01-mlvq-superJumbo.jpg",
         "format": "Super Jumbo",
         "height": 1463,
         "width": 2048,
         "type": "image",
         "subtype": "photo",
         "caption": "A destroyed tank on a street in Kupiansk, in northeastern Ukraine, this month. Russian forces have managed to push forward around the city in recent weeks.",
         "copyright": "Emile Ducke for The New York Times"
     },
     {
         "url": "https://static01.nyt.com/images/2023/08/26/multimedia/26ukraine-ledeall-01-mlvq/26ukraine-ledeall-01-mlvq-threeByTwoSmallAt2X.jpg",
         "format": "threeByTwoSmallAt2X",
         "height": 400,
         "width": 600,
         "type": "image",
         "subtype": "photo",
         "caption": "A destroyed tank on a street in Kupiansk, in northeastern Ukraine, this month. Russian forces have managed to push forward around the city in recent weeks.",
         "copyright": "Emile Ducke for The New York Times"
     },
     {
         "url": "https://static01.nyt.com/images/2023/08/26/multimedia/26ukraine-ledeall-01-mlvq/26ukraine-ledeall-01-mlvq-thumbLarge.jpg",
         "format": "Large Thumbnail",
         "height": 150,
         "width": 150,
         "type": "image",
         "subtype": "photo",
         "caption": "A destroyed tank on a street in Kupiansk, in northeastern Ukraine, this month. Russian forces have managed to push forward around the city in recent weeks.",
         "copyright": "Emile Ducke for The New York Times"
     }
     ],
     "short_url": "https://nyti.ms/47GEpng"
 },
 {
     "section": "world",
     "subsection": "middleeast",
     "title": "U.S. Knew Saudis Were Killing African Migrants",
     "abstract": "The United States was told last year that Saudi security forces were shooting, shelling and abusing groups of migrants, but it chose not to raise the issue publicly.",
     "url": "https://www.nytimes.com/2023/08/26/world/middleeast/saudi-killing-migrants-yemen.html",
     "uri": "nyt://article/55b22270-cfe0-51b1-bd38-2541d6663fae",
     "byline": "By Ben Hubbard and Edward Wong",
     "item_type": "Article",
     "updated_date": "2023-08-26T21:05:17-04:00",
     "created_date": "2023-08-26T14:57:01-04:00",
     "published_date": "2023-08-26T14:57:01-04:00",
     "material_type_facet": "",
     "kicker": "",
     "des_facet": [
     "Illegal Immigration",
     "Human Rights and Human Rights Violations",
     "War Crimes, Genocide and Crimes Against Humanity"
     ],
     "org_facet": [
     "Human Rights Watch",
     "United Nations"
     ],
     "per_facet": [
     "Biden, Joseph R Jr"
     ],
     "geo_facet": [
     "Aden (Yemen)",
     "Ethiopia",
     "Europe",
     "Saudi Arabia",
     "Yemen",
     "United States"
     ],
     "multimedia": [
     {
         "url": "https://static01.nyt.com/images/2023/08/26/multimedia/26Yemen-kjgf/26Yemen-kjgf-superJumbo.jpg",
         "format": "Super Jumbo",
         "height": 1365,
         "width": 2048,
         "type": "image",
         "subtype": "photo",
         "caption": "Ethiopian migrants on the outskirts of the Yemeni capital of Sana heading for the Saudi Arabian border, where some have faced violence at the hands of Saudi border guards.",
         "copyright": "Mohammed Hamoud/Getty Images"
     },
     {
         "url": "https://static01.nyt.com/images/2023/08/26/multimedia/26Yemen-kjgf/26Yemen-kjgf-threeByTwoSmallAt2X.jpg",
         "format": "threeByTwoSmallAt2X",
         "height": 400,
         "width": 600,
         "type": "image",
         "subtype": "photo",
         "caption": "Ethiopian migrants on the outskirts of the Yemeni capital of Sana heading for the Saudi Arabian border, where some have faced violence at the hands of Saudi border guards.",
         "copyright": "Mohammed Hamoud/Getty Images"
     },
     {
         "url": "https://static01.nyt.com/images/2023/08/26/multimedia/26Yemen-kjgf/26Yemen-kjgf-thumbLarge.jpg",
         "format": "Large Thumbnail",
         "height": 150,
         "width": 150,
         "type": "image",
         "subtype": "photo",
         "caption": "Ethiopian migrants on the outskirts of the Yemeni capital of Sana heading for the Saudi Arabian border, where some have faced violence at the hands of Saudi border guards.",
         "copyright": "Mohammed Hamoud/Getty Images"
     }
     ],
     "short_url": "https://nyti.ms/3OKkDOY"
 },
 {
     "section": "world",
     "subsection": "africa",
     "title": "Incumbent Claims Victory in Zimbabwe Election Amid Fraud Accusations",
     "abstract": "President Emmerson Mnangagwa won another five-year term, but did so by intimidating voters and manipulating the campaign process, the opposition says.",
     "url": "https://www.nytimes.com/2023/08/26/world/africa/zimbabwe-election-mnangagwa-wins.html",
     "uri": "nyt://article/9b3a39a8-709a-5f64-b162-07582e6b52d8",
     "byline": "By John Eligon",
     "item_type": "Article",
     "updated_date": "2023-08-26T21:56:27-04:00",
     "created_date": "2023-08-26T17:35:49-04:00",
     "published_date": "2023-08-26T17:35:49-04:00",
     "material_type_facet": "",
     "kicker": "",
     "des_facet": [
     "Voter Fraud (Election Fraud)",
     "Politics and Government"
     ],
     "org_facet": [
     "Citizens Coalition for Change (Zimbabwean Political Party)",
     "Zimbabwe African National Union-Patriotic Front (ZANU-PF)"
     ],
     "per_facet": [
     "Chamisa, Nelson",
     "Mnangagwa, Emmerson"
     ],
     "geo_facet": [
     "Zimbabwe"
     ],
     "multimedia": [
     {
         "url": "https://static01.nyt.com/images/2023/08/24/multimedia/00ZIMBABWE-ELECTION-HFO-vjhg/00ZIMBABWE-ELECTION-HFO-vjhg-superJumbo.jpg",
         "format": "Super Jumbo",
         "height": 1350,
         "width": 2048,
         "type": "image",
         "subtype": "photo",
         "caption": "President Emmerson Mnangagwa at a campaign rally in Harare, Zimbabwe, this month. The country has a history of election irregularities.",
         "copyright": "Tsvangirayi Mukwazhi/Associated Press"
     },
     {
         "url": "https://static01.nyt.com/images/2023/08/24/multimedia/00ZIMBABWE-ELECTION-HFO-vjhg/00ZIMBABWE-ELECTION-HFO-vjhg-threeByTwoSmallAt2X.jpg",
         "format": "threeByTwoSmallAt2X",
         "height": 400,
         "width": 600,
         "type": "image",
         "subtype": "photo",
         "caption": "President Emmerson Mnangagwa at a campaign rally in Harare, Zimbabwe, this month. The country has a history of election irregularities.",
         "copyright": "Tsvangirayi Mukwazhi/Associated Press"
     },
     {
         "url": "https://static01.nyt.com/images/2023/08/24/multimedia/00ZIMBABWE-ELECTION-HFO-vjhg/00ZIMBABWE-ELECTION-HFO-vjhg-thumbLarge.jpg",
         "format": "Large Thumbnail",
         "height": 150,
         "width": 150,
         "type": "image",
         "subtype": "photo",
         "caption": "President Emmerson Mnangagwa at a campaign rally in Harare, Zimbabwe, this month. The country has a history of election irregularities.",
         "copyright": "Tsvangirayi Mukwazhi/Associated Press"
     }
     ],
     "short_url": "https://nyti.ms/3Pdod5D"
 },
 {
     "section": "world",
     "subsection": "europe",
     "title": "At This Movie, Their Phones Won’t Bother You. Their Barking Might.",
     "abstract": "A cinema chain in Britain is welcoming dogs to select screenings. They don’t need their own tickets, and they don’t need to turn off their cellphones.",
     "url": "https://www.nytimes.com/2023/08/26/world/europe/curzon-cinema-dogs-screenings.html",
     "uri": "nyt://article/928d4715-a2fe-506e-8f67-5bb91cef7e0f",
     "byline": "By Derrick Bryson Taylor",
     "item_type": "Article",
     "updated_date": "2023-08-26T11:41:36-04:00",
     "created_date": "2023-08-26T06:04:41-04:00",
     "published_date": "2023-08-26T06:04:41-04:00",
     "material_type_facet": "",
     "kicker": "",
     "des_facet": [
     "Movies",
     "Pets",
     "Dogs"
     ],
     "org_facet": [],
     "per_facet": [],
     "geo_facet": [
     "Great Britain",
     "London (England)"
     ],
     "multimedia": [
     {
         "url": "https://static01.nyt.com/images/2023/08/23/multimedia/00xp-cinemadogs-mjph/00xp-cinemadogs-mjph-superJumbo.jpg",
         "format": "Super Jumbo",
         "height": 1366,
         "width": 2048,
         "type": "image",
         "subtype": "photo",
         "caption": "Damian and Catriona Spandley, with their dogs Lucky and Jeff, attending a screening of the movie “Strays” at the Curzon Aldgate cinema in London on Saturday. Mr. Spandley is a Curzon employee.",
         "copyright": "Mary Turner for The New York Times"
     },
     {
         "url": "https://static01.nyt.com/images/2023/08/23/multimedia/00xp-cinemadogs-mjph/00xp-cinemadogs-mjph-threeByTwoSmallAt2X.jpg",
         "format": "threeByTwoSmallAt2X",
         "height": 400,
         "width": 600,
         "type": "image",
         "subtype": "photo",
         "caption": "Damian and Catriona Spandley, with their dogs Lucky and Jeff, attending a screening of the movie “Strays” at the Curzon Aldgate cinema in London on Saturday. Mr. Spandley is a Curzon employee.",
         "copyright": "Mary Turner for The New York Times"
     },
     {
         "url": "https://static01.nyt.com/images/2023/08/23/multimedia/00xp-cinemadogs-mjph/00xp-cinemadogs-mjph-thumbLarge.jpg",
         "format": "Large Thumbnail",
         "height": 150,
         "width": 150,
         "type": "image",
         "subtype": "photo",
         "caption": "Damian and Catriona Spandley, with their dogs Lucky and Jeff, attending a screening of the movie “Strays” at the Curzon Aldgate cinema in London on Saturday. Mr. Spandley is a Curzon employee.",
         "copyright": "Mary Turner for The New York Times"
     }
     ],
     "short_url": "https://nyti.ms/3KWW54s"
 }
 ]
}
 */