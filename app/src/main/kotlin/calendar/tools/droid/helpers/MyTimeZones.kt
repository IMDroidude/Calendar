package calendar.tools.droid.helpers

import calendar.tools.droid.models.MyTimeZone


// timezones fetched from https://www.joda.org/joda-time/timezones.html
fun getAllTimeZones() = arrayListOf(
        MyTimeZone("GMT-12", "Etc/GMT+12"),
        MyTimeZone("GMT-11", "Etc/GMT+11"),
        MyTimeZone("GMT-11", "Pacific/Midway"),
        MyTimeZone("GMT-11", "Pacific/Niue"),
        MyTimeZone("GMT-11", "Pacific/Pago_Pago"),
        MyTimeZone("GMT-10", "America/Adak"),
        MyTimeZone("GMT-10", "Etc/GMT+10"),
        MyTimeZone("GMT-10", "HST"),
        MyTimeZone("GMT-10", "Pacific/Honolulu"),
        MyTimeZone("GMT-10", "Pacific/Rarotonga"),
        MyTimeZone("GMT-10", "Pacific/Tahiti"),
        MyTimeZone("GMT-9:30", "Pacific/Marquesas"),
        MyTimeZone("GMT-9", "America/Anchorage"),
        MyTimeZone("GMT-9", "America/Juneau"),
        MyTimeZone("GMT-9", "America/Metlakatla"),
        MyTimeZone("GMT-9", "America/Nome"),
        MyTimeZone("GMT-9", "America/Sitka"),
        MyTimeZone("GMT-9", "America/Yakutat"),
        MyTimeZone("GMT-9", "Etc/GMT+9"),
        MyTimeZone("GMT-9", "Pacific/Gambier"),
        MyTimeZone("GMT-8", "America/Dawson"),
        MyTimeZone("GMT-8", "America/Los_Angeles"),
        MyTimeZone("GMT-8", "America/Tijuana"),
        MyTimeZone("GMT-8", "America/Vancouver"),
        MyTimeZone("GMT-8", "America/Whitehorse"),
        MyTimeZone("GMT-8", "Etc/GMT+8"),
        MyTimeZone("GMT-8", "PST8PDT"),
        MyTimeZone("GMT-8", "Pacific/Pitcairn"),
        MyTimeZone("GMT-7", "America/Boise"),
        MyTimeZone("GMT-7", "America/Cambridge_Bay"),
        MyTimeZone("GMT-7", "America/Chihuahua"),
        MyTimeZone("GMT-7", "America/Creston"),
        MyTimeZone("GMT-7", "America/Dawson_Creek"),
        MyTimeZone("GMT-7", "America/Denver"),
        MyTimeZone("GMT-7", "America/Edmonton"),
        MyTimeZone("GMT-7", "America/Fort_Nelson"),
        MyTimeZone("GMT-7", "America/Hermosillo"),
        MyTimeZone("GMT-7", "America/Inuvik"),
        MyTimeZone("GMT-7", "America/Mazatlan"),
        MyTimeZone("GMT-7", "America/Ojinaga"),
        MyTimeZone("GMT-7", "America/Phoenix"),
        MyTimeZone("GMT-7", "America/Yellowknife"),
        MyTimeZone("GMT-7", "Etc/GMT+7"),
        MyTimeZone("GMT-7", "MST"),
        MyTimeZone("GMT-7", "MST7MDT"),
        MyTimeZone("GMT-6", "America/Bahia_Banderas"),
        MyTimeZone("GMT-6", "America/Belize"),
        MyTimeZone("GMT-6", "America/Chicago"),
        MyTimeZone("GMT-6", "America/Costa_Rica"),
        MyTimeZone("GMT-6", "America/El_Salvador"),
        MyTimeZone("GMT-6", "America/Guatemala"),
        MyTimeZone("GMT-6", "America/Indiana/Knox"),
        MyTimeZone("GMT-6", "America/Indiana/Tell_City"),
        MyTimeZone("GMT-6", "America/Managua"),
        MyTimeZone("GMT-6", "America/Matamoros"),
        MyTimeZone("GMT-6", "America/Menominee"),
        MyTimeZone("GMT-6", "America/Merida"),
        MyTimeZone("GMT-6", "America/Mexico_City"),
        MyTimeZone("GMT-6", "America/Monterrey"),
        MyTimeZone("GMT-6", "America/North_Dakota/Beulah"),
        MyTimeZone("GMT-6", "America/North_Dakota/Center"),
        MyTimeZone("GMT-6", "America/North_Dakota/New_Salem"),
        MyTimeZone("GMT-6", "America/Rainy_River"),
        MyTimeZone("GMT-6", "America/Rankin_Inlet"),
        MyTimeZone("GMT-6", "America/Regina"),
        MyTimeZone("GMT-6", "America/Resolute"),
        MyTimeZone("GMT-6", "America/Swift_Current"),
        MyTimeZone("GMT-6", "America/Tegucigalpa"),
        MyTimeZone("GMT-6", "America/Winnipeg"),
        MyTimeZone("GMT-6", "CST6CDT"),
        MyTimeZone("GMT-6", "Etc/GMT+6"),
        MyTimeZone("GMT-6", "Pacific/Easter"),
        MyTimeZone("GMT-6", "Pacific/Galapagos"),
        MyTimeZone("GMT-5", "America/Atikokan"),
        MyTimeZone("GMT-5", "America/Bogota"),
        MyTimeZone("GMT-5", "America/Cancun"),
        MyTimeZone("GMT-5", "America/Cayman"),
        MyTimeZone("GMT-5", "America/Detroit"),
        MyTimeZone("GMT-5", "America/Eirunepe"),
        MyTimeZone("GMT-5", "America/Grand_Turk"),
        MyTimeZone("GMT-5", "America/Guayaquil"),
        MyTimeZone("GMT-5", "America/Havana"),
        MyTimeZone("GMT-5", "America/Indiana/Indianapolis"),
        MyTimeZone("GMT-5", "America/Indiana/Marengo"),
        MyTimeZone("GMT-5", "America/Indiana/Petersburg"),
        MyTimeZone("GMT-5", "America/Indiana/Vevay"),
        MyTimeZone("GMT-5", "America/Indiana/Vincennes"),
        MyTimeZone("GMT-5", "America/Indiana/Winamac"),
        MyTimeZone("GMT-5", "America/Iqaluit"),
        MyTimeZone("GMT-5", "America/Jamaica"),
        MyTimeZone("GMT-5", "America/Kentucky/Louisville"),
        MyTimeZone("GMT-5", "America/Kentucky/Monticello"),
        MyTimeZone("GMT-5", "America/Lima"),
        MyTimeZone("GMT-5", "America/Nassau"),
        MyTimeZone("GMT-5", "America/New_York"),
        MyTimeZone("GMT-5", "America/Nipigon"),
        MyTimeZone("GMT-5", "America/Panama"),
        MyTimeZone("GMT-5", "America/Pangnirtung"),
        MyTimeZone("GMT-5", "America/Port-au-Prince"),
        MyTimeZone("GMT-5", "America/Rio_Branco"),
        MyTimeZone("GMT-5", "America/Thunder_Bay"),
        MyTimeZone("GMT-5", "America/Toronto"),
        MyTimeZone("GMT-5", "EST"),
        MyTimeZone("GMT-5", "EST5EDT"),
        MyTimeZone("GMT-5", "Etc/GMT+5"),
        MyTimeZone("GMT-4", "America/Anguilla"),
        MyTimeZone("GMT-4", "America/Antigua"),
        MyTimeZone("GMT-4", "America/Aruba"),
        MyTimeZone("GMT-4", "America/Asuncion"),
        MyTimeZone("GMT-4", "America/Barbados"),
        MyTimeZone("GMT-4", "America/Blanc-Sablon"),
        MyTimeZone("GMT-4", "America/Boa_Vista"),
        MyTimeZone("GMT-4", "America/Campo_Grande"),
        MyTimeZone("GMT-4", "America/Caracas"),
        MyTimeZone("GMT-4", "America/Cuiaba"),
        MyTimeZone("GMT-4", "America/Curacao"),
        MyTimeZone("GMT-4", "America/Dominica"),
        MyTimeZone("GMT-4", "America/Glace_Bay"),
        MyTimeZone("GMT-4", "America/Goose_Bay"),
        MyTimeZone("GMT-4", "America/Grenada"),
        MyTimeZone("GMT-4", "America/Guadeloupe"),
        MyTimeZone("GMT-4", "America/Guyana"),
        MyTimeZone("GMT-4", "America/Halifax"),
        MyTimeZone("GMT-4", "America/Kralendijk"),
        MyTimeZone("GMT-4", "America/La_Paz"),
        MyTimeZone("GMT-4", "America/Lower_Princes"),
        MyTimeZone("GMT-4", "America/Manaus"),
        MyTimeZone("GMT-4", "America/Marigot"),
        MyTimeZone("GMT-4", "America/Martinique"),
        MyTimeZone("GMT-4", "America/Moncton"),
        MyTimeZone("GMT-4", "America/Montserrat"),
        MyTimeZone("GMT-4", "America/Port_of_Spain"),
        MyTimeZone("GMT-4", "America/Porto_Velho"),
        MyTimeZone("GMT-4", "America/Puerto_Rico"),
        MyTimeZone("GMT-4", "America/Santiago"),
        MyTimeZone("GMT-4", "America/Santo_Domingo"),
        MyTimeZone("GMT-4", "America/St_Barthelemy"),
        MyTimeZone("GMT-4", "America/St_Kitts"),
        MyTimeZone("GMT-4", "America/St_Lucia"),
        MyTimeZone("GMT-4", "America/St_Thomas"),
        MyTimeZone("GMT-4", "America/St_Vincent"),
        MyTimeZone("GMT-4", "America/Thule"),
        MyTimeZone("GMT-4", "America/Tortola"),
        MyTimeZone("GMT-4", "Atlantic/Bermuda"),
        MyTimeZone("GMT-4", "Etc/GMT+4"),
        MyTimeZone("GMT-3:30", "America/St_Johns"),
        MyTimeZone("GMT-3", "America/Araguaina"),
        MyTimeZone("GMT-3", "America/Argentina/Buenos_Aires"),
        MyTimeZone("GMT-3", "America/Argentina/Catamarca"),
        MyTimeZone("GMT-3", "America/Argentina/Cordoba"),
        MyTimeZone("GMT-3", "America/Argentina/Jujuy"),
        MyTimeZone("GMT-3", "America/Argentina/La_Rioja"),
        MyTimeZone("GMT-3", "America/Argentina/Mendoza"),
        MyTimeZone("GMT-3", "America/Argentina/Rio_Gallegos"),
        MyTimeZone("GMT-3", "America/Argentina/Salta"),
        MyTimeZone("GMT-3", "America/Argentina/San_Juan"),
        MyTimeZone("GMT-3", "America/Argentina/San_Luis"),
        MyTimeZone("GMT-3", "America/Argentina/Tucuman"),
        MyTimeZone("GMT-3", "America/Argentina/Ushuaia"),
        MyTimeZone("GMT-3", "America/Bahia"),
        MyTimeZone("GMT-3", "America/Belem"),
        MyTimeZone("GMT-3", "America/Cayenne"),
        MyTimeZone("GMT-3", "America/Fortaleza"),
        MyTimeZone("GMT-3", "America/Godthab"),
        MyTimeZone("GMT-3", "America/Maceio"),
        MyTimeZone("GMT-3", "America/Miquelon"),
        MyTimeZone("GMT-3", "America/Montevideo"),
        MyTimeZone("GMT-3", "America/Paramaribo"),
        MyTimeZone("GMT-3", "America/Punta_Arenas"),
        MyTimeZone("GMT-3", "America/Recife"),
        MyTimeZone("GMT-3", "America/Santarem"),
        MyTimeZone("GMT-3", "America/Sao_Paulo"),
        MyTimeZone("GMT-3", "Antarctica/Palmer"),
        MyTimeZone("GMT-3", "Antarctica/Rothera"),
        MyTimeZone("GMT-3", "Atlantic/Stanley"),
        MyTimeZone("GMT-3", "Etc/GMT+3"),
        MyTimeZone("GMT-2", "America/Noronha"),
        MyTimeZone("GMT-2", "Atlantic/South_Georgia"),
        MyTimeZone("GMT-2", "Etc/GMT+2"),
        MyTimeZone("GMT-1", "America/Scoresbysund"),
        MyTimeZone("GMT-1", "Atlantic/Azores"),
        MyTimeZone("GMT-1", "Atlantic/Cape_Verde"),
        MyTimeZone("GMT-1", "Etc/GMT+1"),
        MyTimeZone("GMT", "Africa/Abidjan"),
        MyTimeZone("GMT", "Africa/Accra"),
        MyTimeZone("GMT", "Africa/Bamako"),
        MyTimeZone("GMT", "Africa/Banjul"),
        MyTimeZone("GMT", "Africa/Bissau"),
        MyTimeZone("GMT", "Africa/Casablanca"),
        MyTimeZone("GMT", "Africa/Conakry"),
        MyTimeZone("GMT", "Africa/Dakar"),
        MyTimeZone("GMT", "Africa/El_Aaiun"),
        MyTimeZone("GMT", "Africa/Freetown"),
        MyTimeZone("GMT", "Africa/Lome"),
        MyTimeZone("GMT", "Africa/Monrovia"),
        MyTimeZone("GMT", "Africa/Nouakchott"),
        MyTimeZone("GMT", "Africa/Ouagadougou"),
        MyTimeZone("GMT", "America/Danmarkshavn"),
        MyTimeZone("GMT", "Antarctica/Troll"),
        MyTimeZone("GMT", "Atlantic/Canary"),
        MyTimeZone("GMT", "Atlantic/Faroe"),
        MyTimeZone("GMT", "Atlantic/Madeira"),
        MyTimeZone("GMT", "Atlantic/Reykjavik"),
        MyTimeZone("GMT", "Atlantic/St_Helena"),
        MyTimeZone("GMT", "Etc/GMT"),
        MyTimeZone("GMT", "Etc/UCT"),
        MyTimeZone("GMT", "Etc/UTC"),
        MyTimeZone("GMT", "Europe/Dublin"),
        MyTimeZone("GMT", "Europe/Guernsey"),
        MyTimeZone("GMT", "Europe/Isle_of_Man"),
        MyTimeZone("GMT", "Europe/Jersey"),
        MyTimeZone("GMT", "Europe/Lisbon"),
        MyTimeZone("GMT", "Europe/London"),
        MyTimeZone("GMT", "UTC"),
        MyTimeZone("GMT", "WET"),
        MyTimeZone("GMT+1", "Africa/Algiers"),
        MyTimeZone("GMT+1", "Africa/Bangui"),
        MyTimeZone("GMT+1", "Africa/Brazzaville"),
        MyTimeZone("GMT+1", "Africa/Ceuta"),
        MyTimeZone("GMT+1", "Africa/Douala"),
        MyTimeZone("GMT+1", "Africa/Kinshasa"),
        MyTimeZone("GMT+1", "Africa/Lagos"),
        MyTimeZone("GMT+1", "Africa/Libreville"),
        MyTimeZone("GMT+1", "Africa/Luanda"),
        MyTimeZone("GMT+1", "Africa/Malabo"),
        MyTimeZone("GMT+1", "Africa/Ndjamena"),
        MyTimeZone("GMT+1", "Africa/Niamey"),
        MyTimeZone("GMT+1", "Africa/Porto-Novo"),
        MyTimeZone("GMT+1", "Africa/Sao_Tome"),
        MyTimeZone("GMT+1", "Africa/Tunis"),
        MyTimeZone("GMT+2", "Africa/Windhoek"),
        MyTimeZone("GMT+1", "Arctic/Longyearbyen"),
        MyTimeZone("GMT+1", "CET"),
        MyTimeZone("GMT+1", "Etc/GMT-1"),
        MyTimeZone("GMT+1", "Europe/Amsterdam"),
        MyTimeZone("GMT+1", "Europe/Andorra"),
        MyTimeZone("GMT+1", "Europe/Belgrade"),
        MyTimeZone("GMT+1", "Europe/Berlin"),
        MyTimeZone("GMT+1", "Europe/Bratislava"),
        MyTimeZone("GMT+1", "Europe/Brussels"),
        MyTimeZone("GMT+1", "Europe/Budapest"),
        MyTimeZone("GMT+1", "Europe/Busingen"),
        MyTimeZone("GMT+1", "Europe/Copenhagen"),
        MyTimeZone("GMT+1", "Europe/Gibraltar"),
        MyTimeZone("GMT+1", "Europe/Ljubljana"),
        MyTimeZone("GMT+1", "Europe/Luxembourg"),
        MyTimeZone("GMT+1", "Europe/Madrid"),
        MyTimeZone("GMT+1", "Europe/Malta"),
        MyTimeZone("GMT+1", "Europe/Monaco"),
        MyTimeZone("GMT+1", "Europe/Oslo"),
        MyTimeZone("GMT+1", "Europe/Paris"),
        MyTimeZone("GMT+1", "Europe/Podgorica"),
        MyTimeZone("GMT+1", "Europe/Prague"),
        MyTimeZone("GMT+1", "Europe/Rome"),
        MyTimeZone("GMT+1", "Europe/San_Marino"),
        MyTimeZone("GMT+1", "Europe/Sarajevo"),
        MyTimeZone("GMT+1", "Europe/Skopje"),
        MyTimeZone("GMT+1", "Europe/Stockholm"),
        MyTimeZone("GMT+1", "Europe/Tirane"),
        MyTimeZone("GMT+1", "Europe/Vaduz"),
        MyTimeZone("GMT+1", "Europe/Vatican"),
        MyTimeZone("GMT+1", "Europe/Vienna"),
        MyTimeZone("GMT+1", "Europe/Warsaw"),
        MyTimeZone("GMT+1", "Europe/Zagreb"),
        MyTimeZone("GMT+1", "Europe/Zurich"),
        MyTimeZone("GMT+1", "MET"),
        MyTimeZone("GMT+2", "Africa/Blantyre"),
        MyTimeZone("GMT+2", "Africa/Bujumbura"),
        MyTimeZone("GMT+2", "Africa/Cairo"),
        MyTimeZone("GMT+2", "Africa/Gaborone"),
        MyTimeZone("GMT+2", "Africa/Harare"),
        MyTimeZone("GMT+2", "Africa/Johannesburg"),
        MyTimeZone("GMT+2", "Africa/Khartoum"),
        MyTimeZone("GMT+2", "Africa/Kigali"),
        MyTimeZone("GMT+2", "Africa/Lubumbashi"),
        MyTimeZone("GMT+2", "Africa/Lusaka"),
        MyTimeZone("GMT+2", "Africa/Maputo"),
        MyTimeZone("GMT+2", "Africa/Maseru"),
        MyTimeZone("GMT+2", "Africa/Mbabane"),
        MyTimeZone("GMT+2", "Africa/Tripoli"),
        MyTimeZone("GMT+2", "Asia/Amman"),
        MyTimeZone("GMT+2", "Asia/Beirut"),
        MyTimeZone("GMT+2", "Asia/Damascus"),
        MyTimeZone("GMT+2", "Asia/Famagusta"),
        MyTimeZone("GMT+2", "Asia/Gaza"),
        MyTimeZone("GMT+2", "Asia/Hebron"),
        MyTimeZone("GMT+2", "Asia/Jerusalem"),
        MyTimeZone("GMT+2", "Asia/Nicosia"),
        MyTimeZone("GMT+2", "EET"),
        MyTimeZone("GMT+2", "Etc/GMT-2"),
        MyTimeZone("GMT+2", "Europe/Athens"),
        MyTimeZone("GMT+2", "Europe/Bucharest"),
        MyTimeZone("GMT+2", "Europe/Chisinau"),
        MyTimeZone("GMT+2", "Europe/Helsinki"),
        MyTimeZone("GMT+2", "Europe/Kaliningrad"),
        MyTimeZone("GMT+2", "Europe/Kiev"),
        MyTimeZone("GMT+2", "Europe/Mariehamn"),
        MyTimeZone("GMT+2", "Europe/Nicosia"),
        MyTimeZone("GMT+2", "Europe/Riga"),
        MyTimeZone("GMT+2", "Europe/Sofia"),
        MyTimeZone("GMT+2", "Europe/Tallinn"),
        MyTimeZone("GMT+2", "Europe/Uzhgorod"),
        MyTimeZone("GMT+2", "Europe/Vilnius"),
        MyTimeZone("GMT+2", "Europe/Zaporozhye"),
        MyTimeZone("GMT+3", "Africa/Addis_Ababa"),
        MyTimeZone("GMT+3", "Africa/Asmara"),
        MyTimeZone("GMT+3", "Africa/Dar_es_Salaam"),
        MyTimeZone("GMT+3", "Africa/Djibouti"),
        MyTimeZone("GMT+3", "Africa/Juba"),
        MyTimeZone("GMT+3", "Africa/Kampala"),
        MyTimeZone("GMT+3", "Africa/Mogadishu"),
        MyTimeZone("GMT+3", "Africa/Nairobi"),
        MyTimeZone("GMT+3", "Antarctica/Syowa"),
        MyTimeZone("GMT+3", "Asia/Aden"),
        MyTimeZone("GMT+3", "Asia/Baghdad"),
        MyTimeZone("GMT+3", "Asia/Bahrain"),
        MyTimeZone("GMT+3", "Asia/Istanbul"),
        MyTimeZone("GMT+3", "Asia/Kuwait"),
        MyTimeZone("GMT+3", "Asia/Qatar"),
        MyTimeZone("GMT+3", "Asia/Riyadh"),
        MyTimeZone("GMT+3", "Etc/GMT-3"),
        MyTimeZone("GMT+3", "Europe/Istanbul"),
        MyTimeZone("GMT+3", "Europe/Kirov"),
        MyTimeZone("GMT+3", "Europe/Minsk"),
        MyTimeZone("GMT+3", "Europe/Moscow"),
        MyTimeZone("GMT+3", "Europe/Simferopol"),
        MyTimeZone("GMT+3", "Indian/Antananarivo"),
        MyTimeZone("GMT+3", "Indian/Comoro"),
        MyTimeZone("GMT+3", "Indian/Mayotte"),
        MyTimeZone("GMT+3:30", "Asia/Tehran"),
        MyTimeZone("GMT+4", "Asia/Baku"),
        MyTimeZone("GMT+4", "Asia/Dubai"),
        MyTimeZone("GMT+4", "Asia/Muscat"),
        MyTimeZone("GMT+4", "Asia/Tbilisi"),
        MyTimeZone("GMT+4", "Asia/Yerevan"),
        MyTimeZone("GMT+4", "Etc/GMT-4"),
        MyTimeZone("GMT+4", "Europe/Astrakhan"),
        MyTimeZone("GMT+4", "Europe/Samara"),
        MyTimeZone("GMT+4", "Europe/Saratov"),
        MyTimeZone("GMT+4", "Europe/Ulyanovsk"),
        MyTimeZone("GMT+4", "Europe/Volgograd"),
        MyTimeZone("GMT+4", "Indian/Mahe"),
        MyTimeZone("GMT+4", "Indian/Mauritius"),
        MyTimeZone("GMT+4", "Indian/Reunion"),
        MyTimeZone("GMT+4:30", "Asia/Kabul"),
        MyTimeZone("GMT+5", "Antarctica/Mawson"),
        MyTimeZone("GMT+5", "Asia/Aqtau"),
        MyTimeZone("GMT+5", "Asia/Aqtobe"),
        MyTimeZone("GMT+5", "Asia/Ashgabat"),
        MyTimeZone("GMT+5", "Asia/Atyrau"),
        MyTimeZone("GMT+5", "Asia/Dushanbe"),
        MyTimeZone("GMT+5", "Asia/Karachi"),
        MyTimeZone("GMT+5", "Asia/Oral"),
        MyTimeZone("GMT+5", "Asia/Samarkand"),
        MyTimeZone("GMT+5", "Asia/Tashkent"),
        MyTimeZone("GMT+5", "Asia/Yekaterinburg"),
        MyTimeZone("GMT+5", "Etc/GMT-5"),
        MyTimeZone("GMT+5", "Indian/Kerguelen"),
        MyTimeZone("GMT+5", "Indian/Maldives"),
        MyTimeZone("GMT+5:30", "Asia/Colombo"),
        MyTimeZone("GMT+5:30", "Asia/Kolkata"),
        MyTimeZone("GMT+5:45", "Asia/Kathmandu"),
        MyTimeZone("GMT+6", "Antarctica/Vostok"),
        MyTimeZone("GMT+6", "Asia/Almaty"),
        MyTimeZone("GMT+6", "Asia/Bishkek"),
        MyTimeZone("GMT+6", "Asia/Dhaka"),
        MyTimeZone("GMT+6", "Asia/Omsk"),
        MyTimeZone("GMT+6", "Asia/Qyzylorda"),
        MyTimeZone("GMT+6", "Asia/Thimphu"),
        MyTimeZone("GMT+6", "Asia/Urumqi"),
        MyTimeZone("GMT+6", "Etc/GMT-6"),
        MyTimeZone("GMT+6", "Indian/Chagos"),
        MyTimeZone("GMT+6:30", "Asia/Yangon"),
        MyTimeZone("GMT+6:30", "Indian/Cocos"),
        MyTimeZone("GMT+7", "Antarctica/Davis"),
        MyTimeZone("GMT+7", "Asia/Bangkok"),
        MyTimeZone("GMT+7", "Asia/Barnaul"),
        MyTimeZone("GMT+7", "Asia/Ho_Chi_Minh"),
        MyTimeZone("GMT+7", "Asia/Hovd"),
        MyTimeZone("GMT+7", "Asia/Jakarta"),
        MyTimeZone("GMT+7", "Asia/Krasnoyarsk"),
        MyTimeZone("GMT+7", "Asia/Novokuznetsk"),
        MyTimeZone("GMT+7", "Asia/Novosibirsk"),
        MyTimeZone("GMT+7", "Asia/Phnom_Penh"),
        MyTimeZone("GMT+7", "Asia/Pontianak"),
        MyTimeZone("GMT+7", "Asia/Tomsk"),
        MyTimeZone("GMT+7", "Asia/Vientiane"),
        MyTimeZone("GMT+7", "Etc/GMT-7"),
        MyTimeZone("GMT+7", "Indian/Christmas"),
        MyTimeZone("GMT+8", "Antarctica/Casey"),
        MyTimeZone("GMT+8", "Asia/Brunei"),
        MyTimeZone("GMT+8", "Asia/Choibalsan"),
        MyTimeZone("GMT+8", "Asia/Hong_Kong"),
        MyTimeZone("GMT+8", "Asia/Irkutsk"),
        MyTimeZone("GMT+8", "Asia/Kuala_Lumpur"),
        MyTimeZone("GMT+8", "Asia/Kuching"),
        MyTimeZone("GMT+8", "Asia/Macau"),
        MyTimeZone("GMT+8", "Asia/Makassar"),
        MyTimeZone("GMT+8", "Asia/Manila"),
        MyTimeZone("GMT+8", "Asia/Shanghai"),
        MyTimeZone("GMT+8", "Asia/Singapore"),
        MyTimeZone("GMT+8", "Asia/Taipei"),
        MyTimeZone("GMT+8", "Asia/Ulaanbaatar"),
        MyTimeZone("GMT+8", "Australia/Perth"),
        MyTimeZone("GMT+8", "Etc/GMT-8"),
        MyTimeZone("GMT+8:45", "Australia/Eucla"),
        MyTimeZone("GMT+9", "Asia/Chita"),
        MyTimeZone("GMT+9", "Asia/Dili"),
        MyTimeZone("GMT+9", "Asia/Jayapura"),
        MyTimeZone("GMT+9", "Asia/Khandyga"),
        MyTimeZone("GMT+9", "Asia/Pyongyang"),
        MyTimeZone("GMT+9", "Asia/Seoul"),
        MyTimeZone("GMT+9", "Asia/Tokyo"),
        MyTimeZone("GMT+9", "Asia/Yakutsk"),
        MyTimeZone("GMT+9", "Etc/GMT-9"),
        MyTimeZone("GMT+9", "Pacific/Palau"),
        MyTimeZone("GMT+9:30", "Australia/Adelaide"),
        MyTimeZone("GMT+9:30", "Australia/Broken_Hill"),
        MyTimeZone("GMT+9:30", "Australia/Darwin"),
        MyTimeZone("GMT+10", "Antarctica/DumontDUrville"),
        MyTimeZone("GMT+10", "Asia/Ust-Nera"),
        MyTimeZone("GMT+10", "Asia/Vladivostok"),
        MyTimeZone("GMT+10", "Australia/Brisbane"),
        MyTimeZone("GMT+10", "Australia/Currie"),
        MyTimeZone("GMT+10", "Australia/Hobart"),
        MyTimeZone("GMT+10", "Australia/Lindeman"),
        MyTimeZone("GMT+10", "Australia/Melbourne"),
        MyTimeZone("GMT+10", "Australia/Sydney"),
        MyTimeZone("GMT+10", "Etc/GMT-10"),
        MyTimeZone("GMT+10", "Pacific/Chuuk"),
        MyTimeZone("GMT+10", "Pacific/Guam"),
        MyTimeZone("GMT+10", "Pacific/Port_Moresby"),
        MyTimeZone("GMT+10", "Pacific/Saipan"),
        MyTimeZone("GMT+10:30", "Australia/Lord_Howe"),
        MyTimeZone("GMT+11", "Antarctica/Macquarie"),
        MyTimeZone("GMT+11", "Asia/Magadan"),
        MyTimeZone("GMT+11", "Asia/Sakhalin"),
        MyTimeZone("GMT+11", "Asia/Srednekolymsk"),
        MyTimeZone("GMT+11", "Etc/GMT-11"),
        MyTimeZone("GMT+11", "Pacific/Bougainville"),
        MyTimeZone("GMT+11", "Pacific/Efate"),
        MyTimeZone("GMT+11", "Pacific/Guadalcanal"),
        MyTimeZone("GMT+11", "Pacific/Kosrae"),
        MyTimeZone("GMT+11", "Pacific/Norfolk"),
        MyTimeZone("GMT+11", "Pacific/Noumea"),
        MyTimeZone("GMT+11", "Pacific/Pohnpei"),
        MyTimeZone("GMT+12", "Antarctica/McMurdo"),
        MyTimeZone("GMT+12", "Asia/Anadyr"),
        MyTimeZone("GMT+12", "Asia/Kamchatka"),
        MyTimeZone("GMT+12", "Etc/GMT-12"),
        MyTimeZone("GMT+12", "Pacific/Auckland"),
        MyTimeZone("GMT+12", "Pacific/Fiji"),
        MyTimeZone("GMT+12", "Pacific/Funafuti"),
        MyTimeZone("GMT+12", "Pacific/Kwajalein"),
        MyTimeZone("GMT+12", "Pacific/Majuro"),
        MyTimeZone("GMT+12", "Pacific/Nauru"),
        MyTimeZone("GMT+12", "Pacific/Tarawa"),
        MyTimeZone("GMT+12", "Pacific/Wake"),
        MyTimeZone("GMT+12", "Pacific/Wallis"),
        MyTimeZone("GMT+12:45", "Pacific/Chatham"),
        MyTimeZone("GMT+13", "Etc/GMT-13"),
        MyTimeZone("GMT+13", "Pacific/Apia"),
        MyTimeZone("GMT+13", "Pacific/Enderbury"),
        MyTimeZone("GMT+13", "Pacific/Fakaofo"),
        MyTimeZone("GMT+13", "Pacific/Tongatapu"),
        MyTimeZone("GMT+14", "Etc/GMT-14"),
        MyTimeZone("GMT+14", "Pacific/Kiritimati")
)
