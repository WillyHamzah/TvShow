package com.example.tvshow.data.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TvResponse {
    /**
     * page : 1
     * total_results : 45
     * total_pages : 3
     * results : [{"original_name":"鬼滅の刃","genre_ids":[16],"name":"Demon Slayer: Kimetsu no Yaiba","popularity":65.995,"origin_country":["JP"],"vote_count":1,"first_air_date":"2019-04-06","backdrop_path":"/nTvM4mhqNlHIvUkI1gVnW6XP7GG.jpg","original_language":"ja","id":85937,"vote_average":8,"overview":"It is the Taisho Period in Japan. Tanjiro, a kindhearted boy who sells charcoal for a living, finds his family slaughtered by a demon. To make matters worse, his younger sister Nezuko, the sole survivor, has been transformed into a demon herself.\n\nThough devastated by this grim reality, Tanjiro resolves to become a \u201cdemon slayer\u201d so that he can turn his sister back into a human, and kill the demon that massacred his family.","poster_path":"/taT33NroOl2Fn8bUGj8bwdmNw3G.jpg"},{"original_name":"名探偵コナン","genre_ids":[16,35,9648],"name":"Case Closed","popularity":43.739,"origin_country":["JP"],"vote_count":129,"first_air_date":"1996-01-08","backdrop_path":"/G3OypSxGDQqemrMWAgcVOvs6fw.jpg","original_language":"ja","id":30983,"vote_average":6.3,"overview":"The son of a world famous mystery writer, Jimmy Kudo, has achieved his own notoriety by assisting the local police as a student detective. He has always been able to solve the most difficult of criminal cases using his wits and power of reason.","poster_path":"/1o2o7RELi8rtRrTh8iHYkprpDrn.jpg"},{"original_name":"Sesame Street","genre_ids":[16,35,10751],"name":"Sesame Street","popularity":26.587,"origin_country":["US"],"vote_count":76,"first_air_date":"1969-11-10","backdrop_path":"/6HswtHbletDHrR8B84U5KWkXheQ.jpg","original_language":"en","id":502,"vote_average":7.4,"overview":"On a special inner city street, the inhabitants, human and muppet, teach preschool subjects with comedy, cartoons, games, and songs.","poster_path":"/s0LGjlRqbMPUiolvM9hXPgYgILn.jpg"},{"original_name":"みだらな青ちゃんは勉強ができない","genre_ids":[16,35],"name":"Ao-chan Can't Study!","popularity":23.198,"origin_country":["JP"],"vote_count":1,"first_air_date":"2019-04-06","backdrop_path":"/y8ujppuSi7qy3nNACLhold3dyWE.jpg","original_language":"ja","id":87462,"vote_average":6,"overview":"Ao Horie\u2019s father, a popular erotic fiction author, chose Ao\u2019s name because A stands for \u201capple\u201d and O stands for \u201corgy\u201d! Desperate to escape her father\u2019s legacy and get into a prestigious university, Ao devotes herself to studying instead of pursuing romance. She has no time for boys, but there\u2019s just one problem: Kijima, her handsome and popular classmate, just confessed his love to her! And to make matters worse, she can\u2019t stop thinking dirty thoughts about him! Looks like escaping her father\u2019s influence will be harder than she thought\u2026","poster_path":"/6RmHv1BXb8645cfVAUPdTkf2rgj.jpg"},{"original_name":"Ryan's Mystery Playdate","id":88005,"name":"Ryan's Mystery Playdate","popularity":22.123,"vote_count":0,"vote_average":0,"first_air_date":"2019-04-19","poster_path":"/mHTdgCk1gRmG4ZCFapgpwd1F68K.jpg","genre_ids":[],"original_language":"en","backdrop_path":"/iAPQju06BPDyH8GKw7y5Vwp9EEf.jpg","overview":"The live-action series follows Ryan as he tackles a series of imaginative, physical challenges and solves mystery box puzzles to reveal the identity of his playdate.","origin_country":[]},{"original_name":"My Little Pony: Friendship Is Magic","genre_ids":[16,35,10751,10762,10765],"name":"My Little Pony: Friendship Is Magic","popularity":21.068,"origin_country":["CA","US"],"vote_count":78,"first_air_date":"2010-10-10","backdrop_path":"/8iSSsncJ9DhP7k6qhl7heEe4QVH.jpg","original_language":"en","id":33765,"vote_average":6.4,"overview":"\"Get your muzzle out of those books and make some friends!\" That's what Princess Celestia tells Twilight Sparkle. She may be the smartest unicorn in Equestria, but Twilight Sparkle gets an \"incomplete\" in friendship. There's more to life than learning magic, after all -- so she goes to Ponyville on a mission to make friends. There she meets five special ponies who take her on exciting adventures and teach her the most powerful magic of all ... the magic of friendship!","poster_path":"/4NOSPZie6rK0ZFwTamoQJtx3UIe.jpg"},{"original_name":"런닝맨","genre_ids":[35,10764],"name":"Running Man","popularity":17.983,"origin_country":["KR"],"vote_count":21,"first_air_date":"2010-07-11","backdrop_path":"/z6Z6NpHoMCPrNwOMIgumLD1vTQw.jpg","original_language":"ko","id":33238,"vote_average":7.7,"overview":"A never-before-seen new genre of variety show focused in an urban environment with the MCs and guests completing missions to win the race.","poster_path":"/2Wmmu1MkqxJ48J7aySET9EKEjXz.jpg"},{"original_name":"Power Rangers","id":2328,"name":"Power Rangers","popularity":15.035,"vote_count":153,"vote_average":5,"first_air_date":"1993-08-28","poster_path":"/dE7Ub2lko9Hv3ytlySz8irW5hWJ.jpg","genre_ids":[10759,10765],"original_language":"en","backdrop_path":"/wCLLq7eV6AgpRQMLz6VRHkYVTDV.jpg","overview":"A team of teenagers with attitude are recruited to save Angel Grove from the evil witch, Rita Repulsa, and later, Lord Zedd, Emperor of all he sees, and their horde of monsters.","origin_country":["US"]},{"original_name":"Restaurant: Impossible","genre_ids":[10764],"name":"Restaurant: Impossible","popularity":14.543,"origin_country":["US"],"vote_count":10,"first_air_date":"2011-01-19","backdrop_path":"/AkCs12Sdb45JV6VUJEDa5NaMuaB.jpg","original_language":"en","id":35358,"vote_average":5.9,"overview":"Restaurant: Impossible is an American reality television program aired by the Food Network. It is jointly produced by Marc Summers and Shooters TV and stars British chef and restaurateur Robert Irvine, and premiered on January 19, 2011.\n\nIn each episode, Chef Robert Irvine is given the \"mission\" of making the impossible possible by renovating a failing restaurant in two days on a $10,000 budget. Irvine is assisted by HGTV designers Taniya Nayak, Vanessa De Leon, Krista Watterworth, Cheryl Torrenueva, Yvette Irene, Nicole Faccuito, or Lynn Keagan along with general contractor Tom Bury. After assessing the problems with the restaurant, Robert Irvine typically creates a plan for the new decor, oversees the cleaning of the restaurant, reduces the size of the menu and improves the food, develops a promotional activity, educates the restaurant's owners, or trains the staff as needed by each restaurant.\n\nCurrently, each episode opens with:\n\nPreviously, each episode opened with:\n\nThe series' sixth season began airing in April 2013.","poster_path":"/txP1JM2yY3DrhO6v8iWH5pAfEhT.jpg"},{"original_name":"Merz gegen Merz","genre_ids":[35],"name":"Merz gegen Merz","popularity":14.185,"origin_country":["DE"],"vote_count":0,"first_air_date":"2019-04-18","backdrop_path":"/gWERixe8sG7raQV8AosAefvpbvc.jpg","original_language":"de","id":84897,"vote_average":0,"overview":"","poster_path":"/2nadVYEPBSUbV6WZpH6nmi4fmRO.jpg"},{"original_name":"Mickey Mouse","genre_ids":[16,35],"name":"Mickey Mouse","popularity":13.878,"origin_country":["US"],"vote_count":18,"first_air_date":"2013-06-28","backdrop_path":"/qqaCwVzDmocRBI5Kl4RGgfwabn1.jpg","original_language":"en","id":46879,"vote_average":5.8,"overview":"In this series of cartoon shorts, Mickey Mouse finds himself in silly situations all around the world! From New York to Paris to Tokyo, Mickey experiences new adventures with his friends!","poster_path":"/aAJ5T2Ab28vbbP9s6wWqdtK3arQ.jpg"},{"original_name":"Ransom","genre_ids":[80,18],"name":"Ransom","popularity":11.733,"origin_country":["CA"],"vote_count":38,"first_air_date":"2017-01-01","backdrop_path":"/wZpruuxMg5r6KB2uMfAHFXbXJ01.jpg","original_language":"en","id":69309,"vote_average":5.3,"overview":"Eric Beaumont's crisis negotiator team is brought in to save lives and resolve the most difficult kidnap and ransom cases when no one else can.","poster_path":"/msn327MnlMG2iMess6CSTcn3HT2.jpg"},{"original_name":"Game Shakers","id":64264,"name":"Game Shakers","popularity":10.969,"vote_count":14,"vote_average":5.7,"first_air_date":"2015-09-12","poster_path":"/84BvYikLEFvwKoZk4FIrRd5YtGH.jpg","genre_ids":[35],"original_language":"en","backdrop_path":"/qQoKJoJnKdWCBocQPc6Vqq2DIGL.jpg","overview":"A live-action sitcom about two 12-year-old girls who start a multi-million-dollar gaming company and take on rap superstar Double G as a business partner.","origin_country":["US"]},{"original_name":"아는 형님","genre_ids":[35,10764],"name":"Men on a Mission","popularity":9.126,"origin_country":["KR"],"vote_count":3,"first_air_date":"2015-12-05","backdrop_path":"/odItfoVoACL99EmWmqmWxBCrpXg.jpg","original_language":"ko","id":70672,"vote_average":8.3,"overview":"Male celebs play make-believe as high schoolers, welcoming star transfer students every week and engaging in battles of witty humor and slapstick.","poster_path":"/zak7mqMxJGnnWplSdbjDtV7bg2Y.jpg"},{"original_name":"ひとりぼっちの○○生活","genre_ids":[16,35],"name":"Hitori Bocchi no Marumaruseikatsu","popularity":7.518,"origin_country":["JP"],"vote_count":1,"first_air_date":"2019-04-06","backdrop_path":"/lteiIjL87MEPMUTshkOuk7z13gF.jpg","original_language":"ja","id":85990,"vote_average":6,"overview":"Hitori Bocchi suffers from extreme social anxiety, she's not good at talking to people, takes pretty extreme actions, is surprisingly adept at avoiding people, her legs cramp when she overexerts herself, gets full of herself when alone, will vomit when exposed to extreme tension and often comes up with plans. Now she is entering middle school and her only friend, Yawara Kai, is attending a different school. This leaves Bocchi alone, surrounded by new classmates with whom she must make friends before Kai will talk to her again.","poster_path":"/btoTzCw3zmjRtB99g2M5Mw2GUQG.jpg"},{"original_name":"Nate & Jeremiah by Design","genre_ids":[10764],"name":"Nate & Jeremiah by Design","popularity":5.927,"origin_country":[],"vote_count":0,"first_air_date":"2017-04-08","backdrop_path":"/xhg3UgrexBdDXnXknrLcCfh3wzq.jpg","original_language":"en","id":70907,"vote_average":0,"overview":"Balancing their roles as design experts and dads, Nate Berkus and Jeremiah Brent show us how to turn a money pit into a masterpiece. In each episode we learn from the mistakes of their clients as these designer husbands rescue them from renovation nightmares.","poster_path":"/lzti9R4Mjp20b1GRfLMAF2K719w.jpg"},{"original_name":"Den stora älgvandringen","genre_ids":[10764],"name":"Den stora älgvandringen","popularity":5.379,"origin_country":["SE"],"vote_count":0,"first_air_date":"2019-04-15","backdrop_path":"/jVtPZnhw18yHb5cMHwjGKLBqobI.jpg","original_language":"sv","id":88476,"vote_average":0,"overview":"","poster_path":null},{"original_name":"PBS NewsHour Weekend","genre_ids":[10763],"name":"PBS NewsHour Weekend","popularity":4.757,"origin_country":["US"],"vote_count":6,"first_air_date":"2013-09-07","backdrop_path":"/cLwczDCfuXE9p6kAljU5RGujz9u.jpg","original_language":"en","id":58287,"vote_average":4.8,"overview":"A summary of the day\u2019s national and international news, using renowned experts to provide in-depth analysis. Each weekend broadcast contains original, in-depth field reporting on topics including education, healthcare, the economy, energy, science and technology, religion, finance and the arts.","poster_path":"/6aeXBSYRqnbLZjhjgK9M12odJly.jpg"},{"original_name":"Tror du jag ljuger?","id":65808,"name":"Tror du jag ljuger?","popularity":4.648,"vote_count":2,"vote_average":4.5,"first_air_date":"2016-03-19","poster_path":"/hjFtGbFQb8NyVN6xyTBRmPafvAt.jpg","genre_ids":[35],"original_language":"sv","backdrop_path":"/cBnpfLI3V5TQ7ynBm1iT2yOwxOc.jpg","overview":"","origin_country":["SE"]},{"original_name":"Live PD","genre_ids":[99],"name":"Live PD","popularity":4.623,"origin_country":["US"],"vote_count":10,"first_air_date":"2016-10-28","backdrop_path":"/oATSGwKgGQVaCL9m4BENAAhah05.jpg","original_language":"en","id":68430,"vote_average":5.9,"overview":"Dash cams capture footage from urban and rural police forces while on the job. A live look inside the everyday calls of police officers across the nation.","poster_path":"/2I2KNf7jZhtkuVVTCqdIgGiNmlI.jpg"}]
     */

    @SerializedName("page")
    private int page;
    @SerializedName("total_results")
    private int totalResults;
    @SerializedName("total_pages")
    private int totalPages;
    @SerializedName("results")
    private List<ResultsTvShow> results;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public List<ResultsTvShow> getResults() {
        return results;
    }

    public void setResults(List<ResultsTvShow> results) {
        this.results = results;
    }

    public static class ResultsTvShow implements Parcelable {
        /**
         * original_name : 鬼滅の刃
         * genre_ids : [16]
         * name : Demon Slayer: Kimetsu no Yaiba
         * popularity : 65.995
         * origin_country : ["JP"]
         * vote_count : 1
         * first_air_date : 2019-04-06
         * backdrop_path : /nTvM4mhqNlHIvUkI1gVnW6XP7GG.jpg
         * original_language : ja
         * id : 85937
         * vote_average : 8
         * overview : It is the Taisho Period in Japan. Tanjiro, a kindhearted boy who sells charcoal for a living, finds his family slaughtered by a demon. To make matters worse, his younger sister Nezuko, the sole survivor, has been transformed into a demon herself.

         Though devastated by this grim reality, Tanjiro resolves to become a “demon slayer” so that he can turn his sister back into a human, and kill the demon that massacred his family.
         * poster_path : /taT33NroOl2Fn8bUGj8bwdmNw3G.jpg
         */

        @SerializedName("original_name")
        private String originalName;
        @SerializedName("name")
        private String name;
        @SerializedName("popularity")
        private double popularity;
        @SerializedName("vote_count")
        private int voteCount;
        @SerializedName("first_air_date")
        private String firstAirDate;
        @SerializedName("backdrop_path")
        private String backdropPath;
        @SerializedName("original_language")
        private String originalLanguage;
        @SerializedName("id")
        private int id;
        @SerializedName("vote_average")
        private double voteAverage;
        @SerializedName("overview")
        private String overview;
        @SerializedName("poster_path")
        private String posterPath;
        @SerializedName("genre_ids")
        private List<Integer> genreIds;
        @SerializedName("origin_country")
        private List<String> originCountry;

        protected ResultsTvShow(Parcel in) {
            originalName = in.readString();
            name = in.readString();
            popularity = in.readDouble();
            voteCount = in.readInt();
            firstAirDate = in.readString();
            backdropPath = in.readString();
            originalLanguage = in.readString();
            id = in.readInt();
            voteAverage = in.readDouble();
            overview = in.readString();
            posterPath = in.readString();
            originCountry = in.createStringArrayList();
        }

        public static final Creator<ResultsTvShow> CREATOR = new Creator<ResultsTvShow>() {
            @Override
            public ResultsTvShow createFromParcel(Parcel in) {
                return new ResultsTvShow(in);
            }

            @Override
            public ResultsTvShow[] newArray(int size) {
                return new ResultsTvShow[size];
            }
        };

        public String getOriginalName() {
            return originalName;
        }

        public void setOriginalName(String originalName) {
            this.originalName = originalName;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPopularity() {
            return popularity;
        }

        public void setPopularity(double popularity) {
            this.popularity = popularity;
        }

        public int getVoteCount() {
            return voteCount;
        }

        public void setVoteCount(int voteCount) {
            this.voteCount = voteCount;
        }

        public String getFirstAirDate() {
            return firstAirDate;
        }

        public void setFirstAirDate(String firstAirDate) {
            this.firstAirDate = firstAirDate;
        }

        public String getBackdropPath() {
            return backdropPath;
        }

        public void setBackdropPath(String backdropPath) {
            this.backdropPath = backdropPath;
        }

        public String getOriginalLanguage() {
            return originalLanguage;
        }

        public void setOriginalLanguage(String originalLanguage) {
            this.originalLanguage = originalLanguage;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public double getVoteAverage() {
            return voteAverage;
        }

        public void setVoteAverage(int voteAverage) {
            this.voteAverage = voteAverage;
        }

        public String getOverview() {
            return overview;
        }

        public void setOverview(String overview) {
            this.overview = overview;
        }

        public String getPosterPath() {
            return posterPath;
        }

        public void setPosterPath(String posterPath) {
            this.posterPath = posterPath;
        }

        public List<Integer> getGenreIds() {
            return genreIds;
        }

        public void setGenreIds(List<Integer> genreIds) {
            this.genreIds = genreIds;
        }

        public List<String> getOriginCountry() {
            return originCountry;
        }

        public void setOriginCountry(List<String> originCountry) {
            this.originCountry = originCountry;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(originalName);
            dest.writeString(name);
            dest.writeDouble(popularity);
            dest.writeInt(voteCount);
            dest.writeString(firstAirDate);
            dest.writeString(backdropPath);
            dest.writeString(originalLanguage);
            dest.writeInt(id);
            dest.writeDouble(voteAverage);
            dest.writeString(overview);
            dest.writeString(posterPath);
            dest.writeStringList(originCountry);
        }
    }
}
