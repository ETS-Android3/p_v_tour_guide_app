package com.project.tour_guide.data;

import com.project.tour_guide.R;

import java.util.ArrayList;

/**
 * Contains all app data.
 */
public class AppData {

    // Constructor is set to private.
    private AppData() {
    }

    /**
     * Provides a list of {@link Place} when user picks a category from
     * {@link R.id#navigation_view} NavigationView.
     *
     * @param category is the type of required {@link Place}:
     *                 0 -> Places To Visit
     *                 1 -> Places To Eat
     *                 2 -> Night Life
     * @return an ArrayList of {@link Place} based on category.
     */
    public static ArrayList<Place> getPlacesForMainScreen(int category) {
        switch (category) {
            case 0:
                ArrayList<Place> placesToVisit = new ArrayList<>();
                // Adding "Akshardham Temple".
                placesToVisit.add(new Place(0, R.string.title_place_akshardham_temple,
                        R.string.detail_place_akshardham_temple, R.string.timings_akshardham_temple,
                        R.string.entry_fee_akshardham_temple,
                        R.drawable.places_to_visit_akshardham_temple,
                        R.string.nearest_metro_akshardham_temple,
                        R.string.nearest_hospital_akshardham_temple,
                        R.string.nearest_station_akshardham_temple));

                // Adding "Red Fort".
                placesToVisit.add(new Place(0, R.string.title_place_red_fort,
                        R.string.detail_place_red_fort,
                        R.string.timings_red_fort, R.string.entry_fee_red_fort,
                        R.drawable.places_to_visit_red_fort,
                        R.string.nearest_metro_red_fort,
                        R.string.nearest_hospital_red_fort,
                        R.string.nearest_station_red_fort));

                // Adding "India Gate".
                placesToVisit.add(new Place(0, R.string.title_place_india_gate,
                        R.string.detail_place_india_gate,
                        R.integer.data_not_available,
                        R.integer.data_not_available,
                        R.drawable.places_to_visit_india_gate,
                        R.string.nearest_metro_india_gate,
                        R.string.nearest_hospital_india_gate,
                        R.string.nearest_station_india_gate));

                // Adding "Worlds of Wonder".
                placesToVisit.add(new Place(0, R.string.title_place_world_of_wonder,
                        R.string.detail_place_world_of_wonder, R.string.timings_world_of_wonder,
                        R.string.entry_fee_world_of_wonder,
                        R.drawable.places_to_visit_worlds_of_wonder,
                        R.string.nearest_metro_world_of_wonder,
                        R.string.nearest_hospital_world_of_wonder,
                        R.string.nearest_station_world_of_wonder));

                // Adding "Connaught Place".
                placesToVisit.add(new Place(0, R.string.title_place_connaught_place,
                        R.string.detail_place_connaught_place,
                        R.integer.data_not_available,
                        R.integer.data_not_available,
                        R.drawable.places_to_visit_connaught_place,
                        R.string.nearest_metro_connaught_place,
                        R.string.nearest_hospital_connaught_place,
                        R.string.nearest_station_connaught_place));

                // Adding "Dilli Haat".
                placesToVisit.add(new Place(0, R.string.title_place_dilli_haat,
                        R.string.detail_place_dilli_haat,
                        R.string.timings_dilli_haat, R.string.entry_fee_dilli_haat,
                        R.drawable.places_to_visit_dilli_haat,
                        R.string.nearest_metro_dilli_haat,
                        R.string.nearest_hospital_dilli_haat,
                        R.string.nearest_station_dilli_haat));

                // Adding "Qutub Minar"
                placesToVisit.add(new Place(0, R.string.title_place_qutub_minar,
                        R.string.detail_place_qutub_minar,
                        R.string.timings_qutub_minar, R.string.entry_fee_qutub_minar,
                        R.drawable.places_to_visit_qutub_minar,
                        R.string.nearest_metro_qutub_minar,
                        R.string.nearest_hospital_qutub_minar,
                        R.string.nearest_station_qutub_minar));

                // Adding "Humayun’s Tomb".
                placesToVisit.add(new Place(0, R.string.title_place_humayun_tomb,
                        R.string.detail_place_humayun_tomb, R.string.timings_humayun_tomb,
                        R.string.entry_fee_humayun_tomb, R.drawable.places_to_visit_humayun_tomb,
                        R.string.nearest_metro_humayun_tomb,
                        R.string.nearest_hospital_humayun_tomb,
                        R.string.nearest_station_humayun_tomb));

                // Adding "Lotus Temple".
                placesToVisit.add(new Place(0, R.string.title_place_lotus_temple,
                        R.string.detail_place_lotus_temple, R.string.timings_lotus_temple,
                        R.integer.data_not_available,
                        R.drawable.places_to_visit_lotus_temple,
                        R.string.nearest_metro_lotus_temple,
                        R.string.nearest_hospital_lotus_temple,
                        R.string.nearest_station_lotus_temple));

                // Adding "Cyber Hub".
                placesToVisit.add(new Place(0, R.string.title_place_cyber_hub,
                        R.string.detail_place_cyber_hub,
                        R.string.timings_cyber_hub, R.integer.data_not_available,
                        R.drawable.places_to_visit_cyber_hub,
                        R.string.nearest_metro_cyber_hub,
                        R.string.nearest_hospital_cyber_hub,
                        R.string.nearest_station_cyber_hub));

                // Adding "National Rail Museum".
                placesToVisit.add(new Place(0, R.string.title_place_national_rail_museum,
                        R.string.detail_place_national_rail_museum,
                        R.string.timings_national_rail_museum,
                        R.string.entry_fee_national_rail_museum,
                        R.drawable.places_to_visit_national_rail_museum,
                        R.string.nearest_metro_national_rail_museum,
                        R.string.nearest_hospital_national_rail_museum,
                        R.string.nearest_station_national_rail_museum));

                // Adding "Rashtrapati Bhavan".
                placesToVisit.add(new Place(0, R.string.title_place_rashtrapati_bhavan,
                        R.string.detail_place_rashtrapati_bhavan,
                        R.string.timings_rashtrapati_bhavan,
                        R.string.entry_fee_rashtrapati_bhavan,
                        R.drawable.places_to_visit_rashtrapati_bhavan,
                        R.string.nearest_metro_rashtrapati_bhavan,
                        R.string.nearest_hospital_rashtrapati_bhavan,
                        R.string.nearest_station_rashtrapati_bhavan));

                // Adding "Jantar Mantar".
                placesToVisit.add(new Place(0, R.string.title_place_jantar_mantar,
                        R.string.detail_place_jantar_mantar, R.string.timings_jantar_mantar,
                        R.string.entry_fee_jantar_mantar,
                        R.drawable.places_to_visit_jantar_mantar,
                        R.string.nearest_metro_jantar_mantar,
                        R.string.nearest_hospital_jantar_mantar,
                        R.string.nearest_station_jantar_mantar));

                // Adding "Chandni Chowk".
                placesToVisit.add(new Place(0, R.string.title_place_chandni_chowk,
                        R.string.detail_place_chandni_chowk, R.string.timings_chandni_chowk,
                        R.integer.data_not_available,
                        R.drawable.places_to_visit_chandni_chowk,
                        R.string.nearest_metro_chandni_chowk,
                        R.string.nearest_hospital_chandni_chowk,
                        R.string.nearest_station_chandni_chowk));

                // Adding "Lodhi Gardens".
                placesToVisit.add(new Place(0, R.string.title_place_lodhi_garden,
                        R.string.detail_place_lodhi_garden, R.string.timings_lodhi_garden,
                        R.integer.data_not_available,
                        R.drawable.places_to_visit_lodhi_garden,
                        R.string.nearest_metro_lodhi_garden,
                        R.string.nearest_hospital_lodhi_garden,
                        R.string.nearest_station_lodhi_garden));

                return placesToVisit;

            case 1:
                ArrayList<Place> placesToEat = new ArrayList<>();

                // Adding "Connaught Place".
                placesToEat.add(new Place(1, R.string.title_eat_connaught_place,
                        R.string.detail_eat_connaught_place,
                        R.drawable.places_to_eat_connaught_place));

                // Adding "Gali Paranthe Wali".
                placesToEat.add(new Place(1, R.string.title_eat_gali_paranthe_wali,
                        R.string.detail_eat_gali_paranthe_wali,
                        R.drawable.places_to_eat_gali_paranthe_wali));

                // Adding "Jama Masjid".
                placesToEat.add(new Place(1, R.string.title_eat_jama_masjid,
                        R.string.detail_eat_jama_masjid,
                        R.drawable.places_to_eat_jama_masjid));

                // Adding "Karol Bagh".
                placesToEat.add(new Place(1, R.string.title_eat_karol_bagh,
                        R.string.detail_eat_karol_bagh,
                        R.drawable.places_to_eat_karol_bagh));

                // Adding "Khan Market".
                placesToEat.add(new Place(1, R.string.title_eat_khan_market,
                        R.string.detail_eat_khan_market,
                        R.drawable.places_to_eat_khan_market));

                // Adding "Nizamuddin".
                placesToEat.add(new Place(1, R.string.title_eat_nizamuddin,
                        R.string.detail_eat_nizamuddin,
                        R.drawable.places_to_eat_nizamuddin));

                // Adding "North Campus".
                placesToEat.add(new Place(1, R.string.title_eat_north_campus,
                        R.string.detail_eat_north_campus,
                        R.drawable.places_to_eat_north_campus));

                // Adding "South Campus".
                placesToEat.add(new Place(1, R.string.title_eat_south_campus,
                        R.string.detail_eat_south_campus,
                        R.drawable.places_to_eat_south_campus));

                // Adding "Old Delhi".
                placesToEat.add(new Place(1, R.string.title_eat_old_delhi,
                        R.string.detail_eat_old_delhi,
                        R.drawable.places_to_eat_old_delhi));

                return placesToEat;

            case 2:
                ArrayList<Place> nightLife = new ArrayList<>();

                // Adding "Nightclubs".
                nightLife.add(new Place(2, R.string.title_night_nightclubs,
                        R.string.detail_night_nightclubs,
                        R.drawable.night_life_nightclub));

                // Adding "Lounges".
                nightLife.add(new Place(2, R.string.title_night_lounges,
                        R.string.detail_night_lounges,
                        R.drawable.night_life_lounges));

                // Adding "Music Locales".
                nightLife.add(new Place(2, R.string.title_night_music_locales,
                        R.string.detail_night_music_locales,
                        R.drawable.night_life_music_locales));

                // Adding "Liquor Stores".
                nightLife.add(new Place(2, R.string.title_night_liquor_stores,
                        R.string.detail_night_liquor_stores,
                        R.drawable.night_life_liquor_stores));

                // Adding "Dining".
                nightLife.add(new Place(2, R.string.title_night_dining,
                        R.string.detail_night_dining,
                        R.drawable.night_life_dining));

                // Adding "Road Trip".
                nightLife.add(new Place(2, R.string.title_night_road_trip,
                        R.string.detail_night_road_trip,
                        R.drawable.night_life_road_trip));

                // Adding "Movies".
                nightLife.add(new Place(2, R.string.title_night_movies,
                        R.string.detail_night_movies,
                        R.drawable.night_life_movies));

                // Adding "Games".
                nightLife.add(new Place(2, R.string.title_night_games,
                        R.string.detail_night_games,
                        R.drawable.night_life_games));

                return nightLife;

            default:
                return null;
        }
    }

    /**
     * Provides a list of {@link Location} belonging to the user clicked {@link Place} in
     * {@link com.project.tour_guide.fragments.PlacesFragment} Fragment.
     *
     * @param category in which the clicked {@link Place} falls:
     *                 1 -> Places To Eat
     *                 2 -> Night Life
     * @param index    is the position of {@link Place} in the
     *                 {@link com.project.tour_guide.adapters.MainScreenAdapter} ArrayAdapter.
     * @return an ArrayList of type {@link Location}
     */
    public static ArrayList<Location> getLocationsUnderPlace(int category, int index) {
        if (category == 1) {
            switch (index) {
                case 1:
                    ArrayList<Location> connaughtPlaceLocations = new ArrayList<>();

                    // Adding "Barco's".
                    connaughtPlaceLocations.add(new Location(
                            R.string.title_connaught_place_location_one,
                            R.string.must_haves_connaught_place_location_one,
                            R.string.avg_cost_connaught_place_location_one,
                            R.string.address_connaught_place_location_one,
                            R.string.timings_connaught_place_location_one));

                    // Adding "Ardor 2.1".
                    connaughtPlaceLocations.add(new Location(
                            R.string.title_connaught_place_location_two,
                            R.string.must_haves_connaught_place_location_two,
                            R.string.avg_cost_connaught_place_location_two,
                            R.string.address_connaught_place_location_two,
                            R.string.timings_connaught_place_location_two));

                    // Adding "Zen".
                    connaughtPlaceLocations.add(new Location(
                            R.string.title_connaught_place_location_three,
                            R.string.must_haves_connaught_place_location_three,
                            R.string.avg_cost_connaught_place_location_three,
                            R.string.address_connaught_place_location_three,
                            R.string.timings_connaught_place_location_three));

                    // Adding "Warehouse Cafe".
                    connaughtPlaceLocations.add(new Location(
                            R.string.title_connaught_place_location_four,
                            R.string.must_haves_connaught_place_location_four,
                            R.string.avg_cost_connaught_place_location_four,
                            R.string.address_connaught_place_location_four,
                            R.string.timings_connaught_place_location_four));

                    // Adding "Saravana Bhavan".
                    connaughtPlaceLocations.add(new Location(
                            R.string.title_connaught_place_location_five,
                            R.string.must_haves_connaught_place_location_five,
                            R.string.avg_cost_connaught_place_location_five,
                            R.string.address_connaught_place_location_five,
                            R.string.timings_connaught_place_location_five));

                    // Adding "Sagar Ratna".
                    connaughtPlaceLocations.add(new Location(
                            R.string.title_connaught_place_location_six,
                            R.string.must_haves_connaught_place_location_six,
                            R.string.avg_cost_connaught_place_location_six,
                            R.string.address_connaught_place_location_six,
                            R.string.timings_connaught_place_location_six));

                    // Adding "Lord of the Drinks".
                    connaughtPlaceLocations.add(new Location(
                            R.string.title_connaught_place_location_seven,
                            R.string.must_haves_connaught_place_location_seven,
                            R.string.avg_cost_connaught_place_location_seven,
                            R.string.address_connaught_place_location_seven,
                            R.string.timings_connaught_place_location_seven));

                    return connaughtPlaceLocations;

                case 2:
                    ArrayList<Location> galiParantheWaliLocations = new ArrayList<>();

                    // Adding "Gaya Prasad Shiv Charan"
                    galiParantheWaliLocations.add(new Location(
                            R.string.title_gali_paranthe_wali_location_one,
                            R.string.must_haves_gali_paranthe_wali_location_one,
                            R.string.avg_cost_gali_paranthe_wali_location_one,
                            R.string.address_gali_paranthe_wali_location_one,
                            R.string.timings_gali_paranthe_wali_location_one));

                    // Adding "Jung Bahadur Kachori Wala"
                    galiParantheWaliLocations.add(new Location(
                            R.string.title_gali_paranthe_wali_location_two,
                            R.string.must_haves_gali_paranthe_wali_location_two,
                            R.string.avg_cost_gali_paranthe_wali_location_two,
                            R.string.address_gali_paranthe_wali_location_two,
                            R.string.timings_gali_paranthe_wali_location_two));

                    // Adding "Kedarnath Premchand Halwai"
                    galiParantheWaliLocations.add(new Location(
                            R.string.title_gali_paranthe_wali_location_three,
                            R.string.must_haves_gali_paranthe_wali_location_three,
                            R.string.avg_cost_gali_paranthe_wali_location_three,
                            R.string.address_gali_paranthe_wali_location_three,
                            R.string.timings_gali_paranthe_wali_location_three));

                    // Adding "Kanwarji's"
                    galiParantheWaliLocations.add(new Location(
                            R.string.title_gali_paranthe_wali_location_four,
                            R.string.must_haves_gali_paranthe_wali_location_four,
                            R.string.avg_cost_gali_paranthe_wali_location_four,
                            R.string.address_gali_paranthe_wali_location_four,
                            R.string.timings_gali_paranthe_wali_location_four));

                    // Adding "Babu Ram Parantha"
                    galiParantheWaliLocations.add(new Location(
                            R.string.title_gali_paranthe_wali_location_five,
                            R.string.must_haves_gali_paranthe_wali_location_five,
                            R.integer.data_not_available,
                            R.string.address_gali_paranthe_wali_location_five,
                            R.integer.data_not_available));

                    return galiParantheWaliLocations;

                case 3:
                    ArrayList<Location> jamaMasjidLocations = new ArrayList<>();

                    // Adding "Aslam Chicken Corner"
                    jamaMasjidLocations.add(new Location(
                            R.string.title_jama_masjid_location_one,
                            R.string.must_haves_jama_masjid_location_one,
                            R.integer.data_not_available,
                            R.string.address_jama_masjid_location_one,
                            R.integer.data_not_available));

                    // Adding "Al-Jawahar"
                    jamaMasjidLocations.add(new Location(
                            R.string.title_jama_masjid_location_two,
                            R.string.must_haves_jama_masjid_location_two,
                            R.integer.data_not_available,
                            R.string.address_jama_masjid_location_two,
                            R.integer.data_not_available));

                    // Adding "Quereshi Kebabs"
                    jamaMasjidLocations.add(new Location(
                            R.string.title_jama_masjid_location_three,
                            R.string.must_haves_jama_masjid_location_three,
                            R.integer.data_not_available,
                            R.string.address_jama_masjid_location_three,
                            R.integer.data_not_available));

                    // Adding "Haji Mohd. Hussain Fried Chicken"
                    jamaMasjidLocations.add(new Location(
                            R.string.title_jama_masjid_location_four,
                            R.string.must_haves_jama_masjid_location_four,
                            R.integer.data_not_available,
                            R.string.address_jama_masjid_location_four,
                            R.integer.data_not_available));

                    // Adding "Laung Churey Kebabs"
                    jamaMasjidLocations.add(new Location(
                            R.string.title_jama_masjid_location_five,
                            R.string.must_haves_jama_masjid_location_five,
                            R.integer.data_not_available,
                            R.string.address_jama_masjid_location_five,
                            R.integer.data_not_available));

                    // Adding "Kallan Sweets"
                    jamaMasjidLocations.add(new Location(
                            R.string.title_jama_masjid_location_six,
                            R.string.must_haves_jama_masjid_location_six,
                            R.integer.data_not_available,
                            R.string.address_jama_masjid_location_six,
                            R.integer.data_not_available));

                    return jamaMasjidLocations;

                case 4:
                    ArrayList<Location> karolBaghLocations = new ArrayList<>();

                    // Adding "Roshan Di Kulfi"
                    karolBaghLocations.add(new Location(
                            R.string.title_karol_bagh_location_one,
                            R.integer.data_not_available,
                            R.string.avg_cost_karol_bagh_location_one,
                            R.string.address_karol_bagh_location_one,
                            R.string.timings_karol_bagh_location_one));

                    // Adding "Changezi"
                    karolBaghLocations.add(new Location(
                            R.string.title_karol_bagh_location_two,
                            R.integer.data_not_available,
                            R.string.avg_cost_karol_bagh_location_two,
                            R.string.address_karol_bagh_location_two,
                            R.string.timings_karol_bagh_location_two));

                    // Adding "Ganesh Restaurant"
                    karolBaghLocations.add(new Location(
                            R.string.title_karol_bagh_location_three,
                            R.integer.data_not_available,
                            R.string.avg_cost_karol_bagh_location_three,
                            R.string.address_karol_bagh_location_three,
                            R.string.timings_karol_bagh_location_three));

                    // Adding "Art Of Spices"
                    karolBaghLocations.add(new Location(
                            R.string.title_karol_bagh_location_four,
                            R.integer.data_not_available,
                            R.string.avg_cost_karol_bagh_location_four,
                            R.string.address_karol_bagh_location_four,
                            R.string.timings_karol_bagh_location_four));

                    // Adding "Om Corner"
                    karolBaghLocations.add(new Location(
                            R.string.title_karol_bagh_location_five,
                            R.integer.data_not_available,
                            R.string.avg_cost_karol_bagh_location_five,
                            R.string.address_karol_bagh_location_five,
                            R.string.timings_karol_bagh_location_five));

                    return karolBaghLocations;

                case 5:
                    ArrayList<Location> khanMarketLocations = new ArrayList<>();

                    // Adding "Town Hall Restaurant"
                    khanMarketLocations.add(new Location(
                            R.string.title_khan_market_location_one,
                            R.integer.data_not_available,
                            R.integer.data_not_available,
                            R.string.address_khan_market_location_one,
                            R.string.timings_khan_market_location_one));

                    // Adding "The Big Chill Cafe"
                    khanMarketLocations.add(new Location(
                            R.string.title_khan_market_location_two,
                            R.integer.data_not_available,
                            R.integer.data_not_available,
                            R.string.address_khan_market_location_two,
                            R.string.timings_khan_market_location_two));

                    // Adding "Wok In The Clouds"
                    khanMarketLocations.add(new Location(
                            R.string.title_khan_market_location_three,
                            R.integer.data_not_available,
                            R.integer.data_not_available,
                            R.string.address_khan_market_location_three,
                            R.string.timings_khan_market_location_three));

                    // Adding "The Coffee Bean & Tea Leaf"
                    khanMarketLocations.add(new Location(
                            R.string.title_khan_market_location_four,
                            R.integer.data_not_available,
                            R.integer.data_not_available,
                            R.string.address_khan_market_location_four,
                            R.string.timings_khan_market_location_four));

                    // Adding "Cafe Turtle"
                    khanMarketLocations.add(new Location(
                            R.string.title_khan_market_location_five,
                            R.integer.data_not_available,
                            R.integer.data_not_available,
                            R.string.address_khan_market_location_five,
                            R.string.timings_khan_market_location_five));

                    return khanMarketLocations;

                case 6:
                    ArrayList<Location> nizamuddinLocations = new ArrayList<>();

                    // Adding "Dastarkhwam-E-Karim"
                    nizamuddinLocations.add(new Location(
                            R.string.title_nizzamudin_location_one,
                            R.string.must_haves_nizzamudin_location_one,
                            R.integer.data_not_available,
                            R.string.address_nizzamudin_location_one,
                            R.string.timings_nizzamudin_location_one));

                    // Adding "Ghalib Kebab Corner"
                    nizamuddinLocations.add(new Location(
                            R.string.title_nizzamudin_location_two,
                            R.string.must_haves_nizzamudin_location_two,
                            R.integer.data_not_available,
                            R.string.address_nizzamudin_location_two,
                            R.string.timings_nizzamudin_location_two));

                    // Adding "Cafe Turtle"
                    nizamuddinLocations.add(new Location(
                            R.string.title_nizzamudin_location_three,
                            R.integer.data_not_available,
                            R.integer.data_not_available,
                            R.string.address_nizzamudin_location_three,
                            R.string.timings_nizzamudin_location_three));

                    return nizamuddinLocations;

                case 7:
                    ArrayList<Location> northCampusLocations = new ArrayList<>();

                    // Adding "The Hudson Cafe"
                    northCampusLocations.add(new Location(
                            R.string.title_north_campus_location_one,
                            R.string.must_haves_north_campus_location_one,
                            R.string.avg_cost_north_campus_location_one,
                            R.string.address_north_campus_location_one,
                            R.integer.data_not_available));

                    // Adding "Rico's"
                    northCampusLocations.add(new Location(
                            R.string.title_north_campus_location_two,
                            R.string.must_haves_north_campus_location_two,
                            R.string.avg_cost_north_campus_location_two,
                            R.string.address_north_campus_location_two,
                            R.integer.data_not_available));

                    // Adding "OD's"
                    northCampusLocations.add(new Location(
                            R.string.title_north_campus_location_three,
                            R.string.must_haves_north_campus_location_three,
                            R.integer.data_not_available,
                            R.string.address_north_campus_location_three,
                            R.integer.data_not_available));

                    // Adding "YOLO 21"
                    northCampusLocations.add(new Location(
                            R.string.title_north_campus_location_four,
                            R.string.must_haves_north_campus_location_four,
                            R.integer.data_not_available,
                            R.string.address_north_campus_location_four,
                            R.integer.data_not_available));

                    // Adding "Tom Uncle's Maggi Point"
                    northCampusLocations.add(new Location(
                            R.string.title_north_campus_location_five,
                            R.string.must_haves_north_campus_location_five,
                            R.integer.data_not_available,
                            R.string.address_north_campus_location_five,
                            R.integer.data_not_available));

                    return northCampusLocations;

                case 8:
                    ArrayList<Location> southCampusLocations = new ArrayList<>();

                    // Adding "Big Yellow Door"
                    southCampusLocations.add(new Location(
                            R.string.title_south_campus_location_one,
                            R.integer.data_not_available,
                            R.string.avg_cost_south_campus_location_one,
                            R.string.address_south_campus_location_one,
                            R.integer.data_not_available));

                    // Adding "Woodbox Cafe"
                    southCampusLocations.add(new Location(
                            R.string.title_south_campus_location_two,
                            R.integer.data_not_available,
                            R.string.avg_cost_south_campus_location_two,
                            R.string.address_south_campus_location_two,
                            R.integer.data_not_available));

                    // Adding "Scooter On The Wall"
                    southCampusLocations.add(new Location(
                            R.string.title_south_campus_location_three,
                            R.integer.data_not_available,
                            R.string.avg_cost_south_campus_location_three,
                            R.string.address_south_campus_location_three,
                            R.integer.data_not_available));

                    // Adding "Echoes"
                    southCampusLocations.add(new Location(
                            R.string.title_south_campus_location_four,
                            R.integer.data_not_available,
                            R.string.avg_cost_south_campus_location_four,
                            R.string.address_south_campus_location_four,
                            R.integer.data_not_available));

                    // Adding "Diggin"
                    southCampusLocations.add(new Location(
                            R.string.title_south_campus_location_five,
                            R.integer.data_not_available,
                            R.string.avg_cost_south_campus_location_five,
                            R.string.address_south_campus_location_five,
                            R.integer.data_not_available));

                    return southCampusLocations;

                case 9:
                    ArrayList<Location> oldDelhiLocations = new ArrayList<>();

                    // Adding "Kuremal Mohan Lal"
                    oldDelhiLocations.add(new Location(
                            R.string.title_old_delhi_location_one,
                            R.integer.data_not_available,
                            R.integer.data_not_available,
                            R.string.address_old_delhi_location_one,
                            R.integer.data_not_available));

                    // Adding "Old Kheer Shop"
                    oldDelhiLocations.add(new Location(
                            R.string.title_old_delhi_location_two,
                            R.integer.data_not_available,
                            R.integer.data_not_available,
                            R.string.address_old_delhi_location_two,
                            R.integer.data_not_available));

                    // Adding "Arvink Pakode Wala"
                    oldDelhiLocations.add(new Location(
                            R.string.title_old_delhi_location_three,
                            R.integer.data_not_available,
                            R.integer.data_not_available,
                            R.string.address_old_delhi_location_three,
                            R.integer.data_not_available));

                    // Adding "Shyam Sweets"
                    oldDelhiLocations.add(new Location(
                            R.string.title_old_delhi_location_four,
                            R.integer.data_not_available,
                            R.integer.data_not_available,
                            R.string.address_old_delhi_location_four,
                            R.integer.data_not_available));

                    // Adding "Jung Bahadur Kachori Wala"
                    oldDelhiLocations.add(new Location(
                            R.string.title_old_delhi_location_five,
                            R.integer.data_not_available,
                            R.integer.data_not_available,
                            R.string.address_old_delhi_location_five,
                            R.integer.data_not_available));

                    return oldDelhiLocations;
            }
        } else if (category == 2) {
            switch (index) {
                case 1:
                    ArrayList<Location> nightClubLocations = new ArrayList<>();

                    // Adding "Ghungroo"
                    nightClubLocations.add(new Location(
                            R.string.title_nightclubs_location_one,
                            R.string.usp_nightclubs_location_one,
                            R.string.avg_cost_nightclubs_location_one,
                            R.string.address_nightclubs_location_one,
                            R.string.timings_nightclubs_location_one));

                    // Adding "Agni"
                    nightClubLocations.add(new Location(
                            R.string.title_nightclubs_location_two,
                            R.string.usp_nightclubs_location_two,
                            R.string.avg_cost_nightclubs_location_two,
                            R.string.address_nightclubs_location_two,
                            R.string.timings_nightclubs_location_two));

                    // Adding "Kitty Su"
                    nightClubLocations.add(new Location(
                            R.string.title_nightclubs_location_three,
                            R.string.usp_nightclubs_location_three,
                            R.string.avg_cost_nightclubs_location_three,
                            R.string.address_nightclubs_location_three,
                            R.string.timings_nightclubs_location_three));

                    // Adding "Raasta"
                    nightClubLocations.add(new Location(
                            R.string.title_nightclubs_location_four,
                            R.string.usp_nightclubs_location_four,
                            R.string.avg_cost_nightclubs_location_four,
                            R.string.address_nightclubs_location_four,
                            R.integer.data_not_available));

                    // Adding "Summer House"
                    nightClubLocations.add(new Location(
                            R.string.title_nightclubs_location_five,
                            R.string.usp_nightclubs_location_five,
                            R.string.avg_cost_nightclubs_location_five,
                            R.string.address_nightclubs_location_five,
                            R.string.timings_nightclubs_location_five));

                    // Adding "Privee"
                    nightClubLocations.add(new Location(
                            R.string.title_nightclubs_location_six,
                            R.string.usp_nightclubs_location_six,
                            R.string.avg_cost_nightclubs_location_six,
                            R.string.address_nightclubs_location_six,
                            R.string.timings_nightclubs_location_six));

                    // Adding "Key Night Club"
                    nightClubLocations.add(new Location(
                            R.string.title_nightclubs_location_seven,
                            R.string.usp_nightclubs_location_seven,
                            R.string.avg_cost_nightclubs_location_seven,
                            R.string.address_nightclubs_location_seven,
                            R.string.timings_nightclubs_location_seven));

                    // Adding "Lithiyum"
                    nightClubLocations.add(new Location(
                            R.string.title_nightclubs_location_eight,
                            R.string.usp_nightclubs_location_eight,
                            R.string.avg_cost_nightclubs_location_eight,
                            R.string.address_nightclubs_location_eight,
                            R.string.timings_nightclubs_location_eight));

                    return nightClubLocations;

                case 2:
                    ArrayList<Location> loungeLocations = new ArrayList<>();

                    // Adding "AM PM Cafe"
                    loungeLocations.add(new Location(
                            R.string.title_lounges_location_one,
                            R.string.usp_lounges_location_one,
                            R.string.avg_cost_lounges_location_one,
                            R.string.address_lounges_location_one,
                            R.integer.data_not_available));

                    // Adding "Fork You"
                    loungeLocations.add(new Location(
                            R.string.title_lounges_location_two,
                            R.string.usp_lounges_location_two,
                            R.string.avg_cost_lounges_location_two,
                            R.string.address_lounges_location_two,
                            R.string.timings_lounges_location_two));

                    // Adding "Hauz Khas Social, Hauz Khas"
                    loungeLocations.add(new Location(
                            R.string.title_lounges_location_three,
                            R.string.usp_lounges_location_three,
                            R.string.avg_cost_lounges_location_three,
                            R.string.address_lounges_location_three,
                            R.string.timings_lounges_location_three));

                    // Adding "My Bar Headquarters"
                    loungeLocations.add(new Location(
                            R.string.title_lounges_location_four,
                            R.string.usp_lounges_location_four,
                            R.string.avg_cost_lounges_location_four,
                            R.string.address_lounges_location_four,
                            R.string.timings_lounges_location_four));

                    // Adding "Mocha Arthouse Cafe"
                    loungeLocations.add(new Location(
                            R.string.title_lounges_location_five,
                            R.string.usp_lounges_location_five,
                            R.string.avg_cost_lounges_location_five,
                            R.string.address_lounges_location_five,
                            R.string.timings_lounges_location_five));

                    // Adding "Turquoise Cottage"
                    loungeLocations.add(new Location(
                            R.string.title_lounges_location_six,
                            R.string.usp_lounges_location_six,
                            R.string.avg_cost_lounges_location_six,
                            R.string.address_lounges_location_six,
                            R.string.timings_lounges_location_six));

                    // Adding "S Bar & Restaurant"
                    loungeLocations.add(new Location(
                            R.string.title_lounges_location_seven,
                            R.string.usp_lounges_location_seven,
                            R.string.avg_cost_lounges_location_seven,
                            R.string.address_lounges_location_seven,
                            R.string.timings_lounges_location_seven));

                    // Adding "Kylin Sky Bar"
                    loungeLocations.add(new Location(
                            R.string.title_lounges_location_eight,
                            R.string.usp_lounges_location_eight,
                            R.string.avg_cost_lounges_location_eight,
                            R.string.address_lounges_location_eight,
                            R.string.timings_lounges_location_eight));

                    // Adding "The Library"
                    loungeLocations.add(new Location(
                            R.string.title_lounges_location_nine,
                            R.string.usp_lounges_location_nine,
                            R.string.avg_cost_lounges_location_nine,
                            R.string.address_lounges_location_nine,
                            R.string.timings_lounges_location_nine));

                    // Adding "The Beer Cafe - Biggie"
                    loungeLocations.add(new Location(
                            R.string.title_lounges_location_ten,
                            R.string.usp_lounges_location_ten,
                            R.string.avg_cost_lounges_location_ten,
                            R.string.address_lounges_location_ten,
                            R.string.timings_lounges_location_ten));

                    // Adding "Soi 7"
                    loungeLocations.add(new Location(
                            R.string.title_lounges_location_eleven,
                            R.string.usp_lounges_location_eleven,
                            R.string.avg_cost_lounges_location_eleven,
                            R.string.address_lounges_location_eleven,
                            R.string.timings_lounges_location_eleven));

                    return loungeLocations;

                case 3:
                    ArrayList<Location> musicLocaleLocations = new ArrayList<>();

                    // Adding "Hark Rock Cafe"
                    musicLocaleLocations.add(new Location(
                            R.string.title_music_location_one,
                            R.string.usp_music_location_one,
                            R.string.avg_music_location_one,
                            R.string.address_music_location_one,
                            R.string.timings_music_location_one));

                    // Adding "Hybrid"
                    musicLocaleLocations.add(new Location(
                            R.string.title_music_location_two,
                            R.string.usp_music_location_two,
                            R.string.avg_music_location_two,
                            R.string.address_music_location_two,
                            R.string.timings_music_location_two));

                    // Adding "TC Bar & Restaurant"
                    musicLocaleLocations.add(new Location(
                            R.string.title_music_location_three,
                            R.string.usp_music_location_three,
                            R.string.avg_music_location_three,
                            R.string.address_music_location_three,
                            R.string.timings_music_location_three));

                    // Adding "TLR: The Living Room"
                    musicLocaleLocations.add(new Location(
                            R.string.title_music_location_four,
                            R.string.usp_music_location_four,
                            R.string.avg_music_location_four,
                            R.string.address_music_location_four,
                            R.string.timings_music_location_four));

                    return musicLocaleLocations;

                case 4:
                    ArrayList<Location> liquorStoreLocations = new ArrayList<>();

                    // Adding "Discovery Wine"
                    liquorStoreLocations.add(new Location(
                            R.string.title_liquor_location_one,
                            R.string.usp_liquor_location_one,
                            R.integer.data_not_available,
                            R.string.address_liquor_location_one,
                            R.integer.data_not_available));

                    // Adding "Knight Riders"
                    liquorStoreLocations.add(new Location(
                            R.string.title_liquor_location_two,
                            R.string.usp_liquor_location_two,
                            R.integer.data_not_available,
                            R.string.address_liquor_location_two,
                            R.integer.data_not_available));

                    // Adding "Wine Hub"
                    liquorStoreLocations.add(new Location(
                            R.string.title_liquor_location_three,
                            R.string.usp_liquor_location_three,
                            R.integer.data_not_available,
                            R.string.address_liquor_location_three,
                            R.integer.data_not_available));

                    // Adding "Area 69"
                    liquorStoreLocations.add(new Location(
                            R.string.title_liquor_location_four,
                            R.string.usp_liquor_location_four,
                            R.integer.data_not_available,
                            R.string.address_liquor_location_four,
                            R.integer.data_not_available));

                    return liquorStoreLocations;

                case 5:
                    ArrayList<Location> diningLocations = new ArrayList<>();

                    // Adding "Bukhara"
                    diningLocations.add(new Location(
                            R.string.title_dining_location_one,
                            R.string.usp_dining_location_one,
                            R.string.avg_dining_location_one,
                            R.string.address_dining_location_one,
                            R.string.timings_dining_location_one));

                    // Adding "Yellow Brick Road"
                    diningLocations.add(new Location(
                            R.string.title_dining_location_two,
                            R.string.usp_dining_location_two,
                            R.string.avg_dining_location_two,
                            R.string.address_dining_location_two,
                            R.string.timings_dining_location_two));

                    // Adding "Olive Bar & Kitchen"
                    diningLocations.add(new Location(
                            R.string.title_dining_location_three,
                            R.string.usp_dining_location_three,
                            R.string.avg_dining_location_three,
                            R.string.address_dining_location_three,
                            R.string.timings_dining_location_three));

                    // Adding "Sevilla - The Claridges"
                    diningLocations.add(new Location(
                            R.string.title_dining_location_four,
                            R.string.usp_dining_location_four,
                            R.string.avg_dining_location_four,
                            R.string.address_dining_location_four,
                            R.string.timings_dining_location_four));

                    return diningLocations;

                case 6:
                    ArrayList<Location> roadTripLocations = new ArrayList<>();

                    // Adding "Murthal"
                    roadTripLocations.add(new Location(
                            R.string.title_road_location_one,
                            R.string.usp_road_location_one,
                            R.string.avg_road_location_one,
                            R.string.address_road_location_one,
                            R.string.timings_road_location_one));

                    // Adding "McDonald's"
                    roadTripLocations.add(new Location(
                            R.string.title_road_location_two,
                            R.string.usp_road_location_two,
                            R.string.avg_road_location_two,
                            R.string.address_road_location_two,
                            R.string.timings_road_location_two));

                    // Adding "Old Rao Dhaba"
                    roadTripLocations.add(new Location(
                            R.string.title_road_location_three,
                            R.string.usp_road_location_three,
                            R.string.avg_road_location_three,
                            R.string.address_road_location_three,
                            R.string.timings_road_location_three));

                    // Adding "Mannat Dhaba"
                    roadTripLocations.add(new Location(
                            R.string.title_road_location_four,
                            R.string.usp_road_location_four,
                            R.string.avg_road_location_four,
                            R.string.address_road_location_four,
                            R.string.timings_road_location_four));

                    // Adding "Rajwada - The Food Court"
                    roadTripLocations.add(new Location(
                            R.string.title_road_location_five,
                            R.string.usp_road_location_five,
                            R.string.avg_road_location_five,
                            R.string.address_road_location_five,
                            R.string.timings_road_location_five));

                    return roadTripLocations;

                case 7:
                    ArrayList<Location> moviesLocations = new ArrayList<>();

                    // Adding "D.T. Star Cinemas"
                    moviesLocations.add(new Location(
                            R.string.title_movies_location_one,
                            R.integer.data_not_available,
                            R.integer.data_not_available,
                            R.string.address_movies_location_one,
                            R.integer.data_not_available));

                    // Adding "D.T. City Centre"
                    moviesLocations.add(new Location(
                            R.string.title_movies_location_two,
                            R.integer.data_not_available,
                            R.integer.data_not_available,
                            R.string.address_movies_location_two,
                            R.integer.data_not_available));

                    // Adding "MovieTime"
                    moviesLocations.add(new Location(
                            R.string.title_movies_location_three,
                            R.integer.data_not_available,
                            R.integer.data_not_available,
                            R.string.address_movies_location_three,
                            R.integer.data_not_available));

                    // Adding "Satyam Cineplex"
                    moviesLocations.add(new Location(
                            R.string.title_movies_location_four,
                            R.integer.data_not_available,
                            R.integer.data_not_available,
                            R.string.address_movies_location_four,
                            R.integer.data_not_available));

                    return moviesLocations;

                case 8:
                    ArrayList<Location> gamesLocations = new ArrayList<>();

                    // Adding "Monkey Bar"
                    gamesLocations.add(new Location(
                            R.string.title_games_location_one,
                            R.string.usp_games_location_one,
                            R.integer.data_not_available,
                            R.string.address_games_location_one,
                            R.string.timings_games_location_one));

                    // Adding "BluO"
                    gamesLocations.add(new Location(
                            R.string.title_games_location_two,
                            R.string.usp_games_location_two,
                            R.integer.data_not_available,
                            R.string.address_games_location_two,
                            R.integer.data_not_available));

                    // Adding "Underdoggs Sports Bar & Grill"
                    gamesLocations.add(new Location(
                            R.string.title_games_location_three,
                            R.string.usp_games_location_three,
                            R.integer.data_not_available,
                            R.string.address_games_location_three,
                            R.string.timings_games_location_three));

                    return gamesLocations;
            }
        }

        // Invalid Category.
        return null;
    }

    /**
     * @return An ArrayList of type {@link Travel} containing information about all major
     * airports and railway station in Delhi.
     */
    public static ArrayList<Travel> getTransports() {
        ArrayList<Travel> transport = new ArrayList<>();

        // Adding "Indira Gandhi International Airport".
        transport.add(new Travel(R.string.title_airport_IGI, R.string.about_airport_IGI,
                R.string.location_airport_IGI, R.drawable.ic_plane, R.drawable.ripple_airport));

        // Adding "Safdarjung Airport".
        transport.add(new Travel(R.string.title_airport_safdarjung,
                R.string.about_airport_safdarjung, R.string.location_airport_safdarjung,
                R.drawable.ic_plane, R.drawable.ripple_airport));

        // Adding "New Delhi Railway Station".
        transport.add(new Travel(R.string.title_railway_station_NDLS,
                R.string.about_railway_station_NDLS, R.string.location_railway_station_NDLS,
                R.drawable.ic_train, R.drawable.ripple_railway_station));

        // Adding "Old Delhi Railway Station".
        transport.add(new Travel(R.string.title_railway_station_DLI,
                R.string.about_railway_station_DLI, R.string.location_railway_station_DLI,
                R.drawable.ic_train, R.drawable.ripple_railway_station));

        // Adding "Hazrat Nizamuddin Station".
        transport.add(new Travel(R.string.title_railway_station_NZM,
                R.string.about_railway_station_NZM, R.string.location_railway_station_NZM,
                R.drawable.ic_train, R.drawable.ripple_railway_station));

        // Adding "Anand Vihar Terminal Station".
        transport.add(new Travel(R.string.title_railway_station_ANVT,
                R.string.about_railway_station_ANVT, R.string.location_railway_station_ANVT,
                R.drawable.ic_train, R.drawable.ripple_railway_station));

        // Adding "Delhi Sarai Rohilla Station".
        transport.add(new Travel(R.string.title_railway_station_DEE,
                R.string.about_railway_station_DEE, R.string.location_railway_station_DEE,
                R.drawable.ic_train, R.drawable.ripple_railway_station));

        return transport;
    }
}