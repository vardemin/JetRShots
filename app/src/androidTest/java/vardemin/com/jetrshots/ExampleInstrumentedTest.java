package vardemin.com.jetrshots;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.List;

import vardemin.com.jetrshots.models.Shot;
import vardemin.com.jetrshots.util.ShotJSONParser;

import static org.junit.Assert.*;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("vardemin.com.jetrshots", appContext.getPackageName());
    }

    @Test
    public void parsing_isCorrect() throws Exception {
        List<Shot> shots = new ArrayList<Shot>() {{
            add(new Shot(3288729,"Sunset","<p>Background for Telegram Desktop</p>","https://d13yacurqjgara.cloudfront.net/users/926537/screenshots/3288729/shot_copy.png","2017-02-13T18:57:55Z"));
            add(new Shot(3288728,"süm1","","https://d13yacurqjgara.cloudfront.net/users/60778/screenshots/3288728/sumdribb.png","2017-02-13T18:56:35Z"));
            add(new Shot(3288727,"Meet and Beyond Branding and Website","<p>Meet&amp;Beyond is an online service that allows users to find venues for their upcoming events and help venue owners make profit by renting their places. This project showcases Meet&amp;Beyond's new logo, seal, stationery and website design.</p>"
                    ,"https://d13yacurqjgara.cloudfront.net/users/234258/screenshots/3288727/mb-thumb.png","2017-02-13T18:56:03Z"));
        }};
        String json = "[{\n" +
                "    \"id\": 3288729,\n" +
                "    \"title\": \"Sunset\",\n" +
                "    \"description\": \"<p>Background for Telegram Desktop</p>\",\n" +
                "    \"width\": 400,\n" +
                "    \"height\": 300,\n" +
                "    \"images\": {\n" +
                "      \"hidpi\": \"https://d13yacurqjgara.cloudfront.net/users/926537/screenshots/3288729/shot_copy.png\",\n" +
                "      \"normal\": \"https://d13yacurqjgara.cloudfront.net/users/926537/screenshots/3288729/shot_copy_1x.png\",\n" +
                "      \"teaser\": \"https://d13yacurqjgara.cloudfront.net/users/926537/screenshots/3288729/shot_copy_teaser.png\"\n" +
                "    },\n" +
                "    \"views_count\": 1,\n" +
                "    \"likes_count\": 0,\n" +
                "    \"comments_count\": 0,\n" +
                "    \"attachments_count\": 0,\n" +
                "    \"rebounds_count\": 0,\n" +
                "    \"buckets_count\": 0,\n" +
                "    \"created_at\": \"2017-02-13T18:57:55Z\",\n" +
                "    \"updated_at\": \"2017-02-13T18:58:51Z\",\n" +
                "    \"html_url\": \"https://dribbble.com/shots/3288729-Sunset\",\n" +
                "    \"attachments_url\": \"https://api.dribbble.com/v1/shots/3288729/attachments\",\n" +
                "    \"buckets_url\": \"https://api.dribbble.com/v1/shots/3288729/buckets\",\n" +
                "    \"comments_url\": \"https://api.dribbble.com/v1/shots/3288729/comments\",\n" +
                "    \"likes_url\": \"https://api.dribbble.com/v1/shots/3288729/likes\",\n" +
                "    \"projects_url\": \"https://api.dribbble.com/v1/shots/3288729/projects\",\n" +
                "    \"rebounds_url\": \"https://api.dribbble.com/v1/shots/3288729/rebounds\",\n" +
                "    \"animated\": false,\n" +
                "    \"tags\": [\n" +
                "      \"clean\",\n" +
                "      \"clouds\",\n" +
                "      \"illustration\",\n" +
                "      \"mountains\",\n" +
                "      \"sea\",\n" +
                "      \"sunset\"\n" +
                "    ],\n" +
                "    \"user\": {\n" +
                "      \"id\": 926537,\n" +
                "      \"name\": \"Marina Rakhimova\",\n" +
                "      \"username\": \"MarinaMakoto\",\n" +
                "      \"html_url\": \"https://dribbble.com/MarinaMakoto\",\n" +
                "      \"avatar_url\": \"https://d13yacurqjgara.cloudfront.net/users/926537/avatars/normal/fb51ffb00aed3edd2da27abb9ce06cea.jpg?1439802972\",\n" +
                "      \"bio\": \"Hi, dribbblemates! :) I make graphic and icon illustrations, web and motion design. Available for work. marlin_rr@mail.ru\",\n" +
                "      \"location\": \"Ufa, Russia\",\n" +
                "      \"links\": {\n" +
                "        \"web\": \"https://www.upwork.com/freelancers/~017bfcaf80e2e16abb\"\n" +
                "      },\n" +
                "      \"buckets_count\": 8,\n" +
                "      \"comments_received_count\": 43,\n" +
                "      \"followers_count\": 301,\n" +
                "      \"followings_count\": 633,\n" +
                "      \"likes_count\": 7000,\n" +
                "      \"likes_received_count\": 1246,\n" +
                "      \"projects_count\": 0,\n" +
                "      \"rebounds_received_count\": 0,\n" +
                "      \"shots_count\": 23,\n" +
                "      \"teams_count\": 0,\n" +
                "      \"can_upload_shot\": true,\n" +
                "      \"type\": \"Player\",\n" +
                "      \"pro\": false,\n" +
                "      \"buckets_url\": \"https://api.dribbble.com/v1/users/926537/buckets\",\n" +
                "      \"followers_url\": \"https://api.dribbble.com/v1/users/926537/followers\",\n" +
                "      \"following_url\": \"https://api.dribbble.com/v1/users/926537/following\",\n" +
                "      \"likes_url\": \"https://api.dribbble.com/v1/users/926537/likes\",\n" +
                "      \"projects_url\": \"https://api.dribbble.com/v1/users/926537/projects\",\n" +
                "      \"shots_url\": \"https://api.dribbble.com/v1/users/926537/shots\",\n" +
                "      \"teams_url\": \"https://api.dribbble.com/v1/users/926537/teams\",\n" +
                "      \"created_at\": \"2015-08-17T09:14:32Z\",\n" +
                "      \"updated_at\": \"2017-02-13T18:58:53Z\"\n" +
                "    },\n" +
                "    \"team\": null\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 3288728,\n" +
                "    \"title\": \"süm1\",\n" +
                "    \"description\": null,\n" +
                "    \"width\": 400,\n" +
                "    \"height\": 300,\n" +
                "    \"images\": {\n" +
                "      \"hidpi\": \"https://d13yacurqjgara.cloudfront.net/users/60778/screenshots/3288728/sumdribb.png\",\n" +
                "      \"normal\": \"https://d13yacurqjgara.cloudfront.net/users/60778/screenshots/3288728/sumdribb_1x.png\",\n" +
                "      \"teaser\": \"https://d13yacurqjgara.cloudfront.net/users/60778/screenshots/3288728/sumdribb_teaser.png\"\n" +
                "    },\n" +
                "    \"views_count\": 6,\n" +
                "    \"likes_count\": 0,\n" +
                "    \"comments_count\": 0,\n" +
                "    \"attachments_count\": 1,\n" +
                "    \"rebounds_count\": 0,\n" +
                "    \"buckets_count\": 0,\n" +
                "    \"created_at\": \"2017-02-13T18:56:35Z\",\n" +
                "    \"updated_at\": \"2017-02-13T18:57:56Z\",\n" +
                "    \"html_url\": \"https://dribbble.com/shots/3288728-s-m1\",\n" +
                "    \"attachments_url\": \"https://api.dribbble.com/v1/shots/3288728/attachments\",\n" +
                "    \"buckets_url\": \"https://api.dribbble.com/v1/shots/3288728/buckets\",\n" +
                "    \"comments_url\": \"https://api.dribbble.com/v1/shots/3288728/comments\",\n" +
                "    \"likes_url\": \"https://api.dribbble.com/v1/shots/3288728/likes\",\n" +
                "    \"projects_url\": \"https://api.dribbble.com/v1/shots/3288728/projects\",\n" +
                "    \"rebounds_url\": \"https://api.dribbble.com/v1/shots/3288728/rebounds\",\n" +
                "    \"animated\": false,\n" +
                "    \"tags\": [],\n" +
                "    \"user\": {\n" +
                "      \"id\": 60778,\n" +
                "      \"name\": \"popesaintvictor\",\n" +
                "      \"username\": \"popesaintvictor\",\n" +
                "      \"html_url\": \"https://dribbble.com/popesaintvictor\",\n" +
                "      \"avatar_url\": \"https://d13yacurqjgara.cloudfront.net/users/60778/avatars/normal/9201a3098a1843a93c19fdbe73747810.jpg?1429753471\",\n" +
                "      \"bio\": \"designer that doodles.\",\n" +
                "      \"location\": \"Nashville, Tennessee\",\n" +
                "      \"links\": {\n" +
                "        \"web\": \"http://popesaintvictor.com\",\n" +
                "        \"twitter\": \"https://twitter.com/popesaintvictor\"\n" +
                "      },\n" +
                "      \"buckets_count\": 0,\n" +
                "      \"comments_received_count\": 36,\n" +
                "      \"followers_count\": 862,\n" +
                "      \"followings_count\": 167,\n" +
                "      \"likes_count\": 473,\n" +
                "      \"likes_received_count\": 511,\n" +
                "      \"projects_count\": 2,\n" +
                "      \"rebounds_received_count\": 0,\n" +
                "      \"shots_count\": 22,\n" +
                "      \"teams_count\": 1,\n" +
                "      \"can_upload_shot\": true,\n" +
                "      \"type\": \"Player\",\n" +
                "      \"pro\": false,\n" +
                "      \"buckets_url\": \"https://api.dribbble.com/v1/users/60778/buckets\",\n" +
                "      \"followers_url\": \"https://api.dribbble.com/v1/users/60778/followers\",\n" +
                "      \"following_url\": \"https://api.dribbble.com/v1/users/60778/following\",\n" +
                "      \"likes_url\": \"https://api.dribbble.com/v1/users/60778/likes\",\n" +
                "      \"projects_url\": \"https://api.dribbble.com/v1/users/60778/projects\",\n" +
                "      \"shots_url\": \"https://api.dribbble.com/v1/users/60778/shots\",\n" +
                "      \"teams_url\": \"https://api.dribbble.com/v1/users/60778/teams\",\n" +
                "      \"created_at\": \"2011-09-09T17:57:51Z\",\n" +
                "      \"updated_at\": \"2017-02-13T18:58:32Z\"\n" +
                "    },\n" +
                "    \"team\": null\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 3288727,\n" +
                "    \"title\": \"Meet and Beyond Branding and Website\",\n" +
                "    \"description\": \"<p>Meet&amp;Beyond is an online service that allows users to find venues for their upcoming events and help venue owners make profit by renting their places. This project showcases Meet&amp;Beyond's new logo, seal, stationery and website design.</p>\",\n" +
                "    \"width\": 400,\n" +
                "    \"height\": 300,\n" +
                "    \"images\": {\n" +
                "      \"hidpi\": \"https://d13yacurqjgara.cloudfront.net/users/234258/screenshots/3288727/mb-thumb.png\",\n" +
                "      \"normal\": \"https://d13yacurqjgara.cloudfront.net/users/234258/screenshots/3288727/mb-thumb_1x.png\",\n" +
                "      \"teaser\": \"https://d13yacurqjgara.cloudfront.net/users/234258/screenshots/3288727/mb-thumb_teaser.png\"\n" +
                "    },\n" +
                "    \"views_count\": 4,\n" +
                "    \"likes_count\": 1,\n" +
                "    \"comments_count\": 0,\n" +
                "    \"attachments_count\": 4,\n" +
                "    \"rebounds_count\": 0,\n" +
                "    \"buckets_count\": 0,\n" +
                "    \"created_at\": \"2017-02-13T18:56:03Z\",\n" +
                "    \"updated_at\": \"2017-02-13T18:56:45Z\",\n" +
                "    \"html_url\": \"https://dribbble.com/shots/3288727-Meet-and-Beyond-Branding-and-Website\",\n" +
                "    \"attachments_url\": \"https://api.dribbble.com/v1/shots/3288727/attachments\",\n" +
                "    \"buckets_url\": \"https://api.dribbble.com/v1/shots/3288727/buckets\",\n" +
                "    \"comments_url\": \"https://api.dribbble.com/v1/shots/3288727/comments\",\n" +
                "    \"likes_url\": \"https://api.dribbble.com/v1/shots/3288727/likes\",\n" +
                "    \"projects_url\": \"https://api.dribbble.com/v1/shots/3288727/projects\",\n" +
                "    \"rebounds_url\": \"https://api.dribbble.com/v1/shots/3288727/rebounds\",\n" +
                "    \"animated\": false,\n" +
                "    \"tags\": [\n" +
                "      \"brand\",\n" +
                "      \"branding\",\n" +
                "      \"corporate identity\",\n" +
                "      \"identity\",\n" +
                "      \"logo\",\n" +
                "      \"mark\"\n" +
                "    ],\n" +
                "    \"user\": {\n" +
                "      \"id\": 234258,\n" +
                "      \"name\": \"Ozan Karakoc\",\n" +
                "      \"username\": \"ozankarakoc\",\n" +
                "      \"html_url\": \"https://dribbble.com/ozankarakoc\",\n" +
                "      \"avatar_url\": \"https://d13yacurqjgara.cloudfront.net/users/234258/avatars/normal/83c5827e01ac8e2297c3ac5705732b3c.jpg?1418684801\",\n" +
                "      \"bio\": \"Creative Director / Graphic Designer\",\n" +
                "      \"location\": \"Los Angeles\",\n" +
                "      \"links\": {\n" +
                "        \"web\": \"http://www.ozankarakoc.com\"\n" +
                "      },\n" +
                "      \"buckets_count\": 0,\n" +
                "      \"comments_received_count\": 45,\n" +
                "      \"followers_count\": 137,\n" +
                "      \"followings_count\": 54,\n" +
                "      \"likes_count\": 89,\n" +
                "      \"likes_received_count\": 859,\n" +
                "      \"projects_count\": 2,\n" +
                "      \"rebounds_received_count\": 0,\n" +
                "      \"shots_count\": 77,\n" +
                "      \"teams_count\": 0,\n" +
                "      \"can_upload_shot\": true,\n" +
                "      \"type\": \"Player\",\n" +
                "      \"pro\": true,\n" +
                "      \"buckets_url\": \"https://api.dribbble.com/v1/users/234258/buckets\",\n" +
                "      \"followers_url\": \"https://api.dribbble.com/v1/users/234258/followers\",\n" +
                "      \"following_url\": \"https://api.dribbble.com/v1/users/234258/following\",\n" +
                "      \"likes_url\": \"https://api.dribbble.com/v1/users/234258/likes\",\n" +
                "      \"projects_url\": \"https://api.dribbble.com/v1/users/234258/projects\",\n" +
                "      \"shots_url\": \"https://api.dribbble.com/v1/users/234258/shots\",\n" +
                "      \"teams_url\": \"https://api.dribbble.com/v1/users/234258/teams\",\n" +
                "      \"created_at\": \"2012-11-08T23:06:42Z\",\n" +
                "      \"updated_at\": \"2017-02-13T18:58:36Z\"\n" +
                "    },\n" +
                "    \"team\": null\n" +
                "  }" +
                "]";
        assertEquals(shots.get(1),ShotJSONParser.parseData(json).get(1));
    }
}
