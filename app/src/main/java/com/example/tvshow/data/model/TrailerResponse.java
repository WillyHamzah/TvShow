package com.example.tvshow.data.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TrailerResponse {

    /**
     * id : 85937
     * results : [{"id":"5c40f2339251416e2db140b4","iso_639_1":"en","iso_3166_1":"US","key":"BpiILiEZuF4","name":"TVアニメ「鬼滅の刃」第1弾PV 2019年4月放送開始","site":"YouTube","size":1080,"type":"Teaser"},{"id":"5caa5c1ec3a3683f4f623cc8","iso_639_1":"en","iso_3166_1":"US","key":"Sl2k7bfBeCw","name":"Demon Slayer: Kimetsu no Yaiba | OFFICIAL PREVIEW","site":"YouTube","size":1080,"type":"Trailer"}]
     */

    @SerializedName("id")
    private int id;
    @SerializedName("results")
    private List<ResultsTvTrailer> results;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<ResultsTvTrailer> getResults() {
        return results;
    }

    public void setResults(List<ResultsTvTrailer> results) {
        this.results = results;
    }

    public static class ResultsTvTrailer {
        /**
         * id : 5c40f2339251416e2db140b4
         * iso_639_1 : en
         * iso_3166_1 : US
         * key : BpiILiEZuF4
         * name : TVアニメ「鬼滅の刃」第1弾PV 2019年4月放送開始
         * site : YouTube
         * size : 1080
         * type : Teaser
         */

        @SerializedName("id")
        private String id;
        @SerializedName("iso_639_1")
        private String iso6391;
        @SerializedName("iso_3166_1")
        private String iso31661;
        @SerializedName("key")
        private String key;
        @SerializedName("name")
        private String name;
        @SerializedName("site")
        private String site;
        @SerializedName("size")
        private int size;
        @SerializedName("type")
        private String type;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getIso6391() {
            return iso6391;
        }

        public void setIso6391(String iso6391) {
            this.iso6391 = iso6391;
        }

        public String getIso31661() {
            return iso31661;
        }

        public void setIso31661(String iso31661) {
            this.iso31661 = iso31661;
        }

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSite() {
            return site;
        }

        public void setSite(String site) {
            this.site = site;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }
}
