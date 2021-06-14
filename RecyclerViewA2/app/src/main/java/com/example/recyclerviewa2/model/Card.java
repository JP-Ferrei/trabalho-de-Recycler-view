package com.example.recyclerviewa2.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.example.recyclerviewa2.R;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Card implements Parcelable  {


        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("manaCost")
        @Expose
        private String manaCost;
        @SerializedName("cmc")
        @Expose
        private Integer cmc;
        @SerializedName("colors")
        @Expose
        private List<String> colors = null;
        @SerializedName("colorIdentity")
        @Expose
        private List<String> colorIdentity = null;
        @SerializedName("type")
        @Expose
        private String type;
        @SerializedName("types")
        @Expose
        private List<String> types = null;
        @SerializedName("subtypes")
        @Expose
        private List<String> subtypes = null;
        @SerializedName("rarity")
        @Expose
        private String rarity;
        @SerializedName("set")
        @Expose
        private String set;
        @SerializedName("setName")
        @Expose
        private String setName;
        @SerializedName("text")
        @Expose
        private String text;
        @SerializedName("artist")
        @Expose
        private String artist;
        @SerializedName("number")
        @Expose
        private String number;
        @SerializedName("power")
        @Expose
        private String power;
        @SerializedName("toughness")
        @Expose
        private String toughness;
        @SerializedName("layout")
        @Expose
        private String layout;
        @SerializedName("multiverseid")
        @Expose
        private String multiverseid;
        @SerializedName("imageUrl")
        @Expose
        private String imageUrl;
        @SerializedName("variations")
        @Expose
        private List<String> variations = null;
       // @SerializedName("foreignNames")
      //  @Expose
       // private List<ForeignName> foreignNames = null;
        @SerializedName("printings")
        @Expose
        private List<String> printings = null;
        @SerializedName("originalText")
        @Expose
        private String originalText;
        @SerializedName("originalType")
        @Expose
        private String originalType;
      //  @SerializedName("legalities")
       // @Expose
        //private List<Legality> legalities = null;
        @SerializedName("id")
        @Expose
        private String id;

        private int imagem = R.drawable.fundoimagem;



    protected Card(Parcel in) {
        name = in.readString();
        manaCost = in.readString();
        if (in.readByte() == 0) {
            cmc = null;
        } else {
            cmc = in.readInt();
        }
        colors = in.createStringArrayList();
        colorIdentity = in.createStringArrayList();
        type = in.readString();
        types = in.createStringArrayList();
        subtypes = in.createStringArrayList();
        rarity = in.readString();
        set = in.readString();
        setName = in.readString();
        text = in.readString();
        artist = in.readString();
        number = in.readString();
        power = in.readString();
        toughness = in.readString();
        layout = in.readString();
        multiverseid = in.readString();
        imageUrl = in.readString();
        variations = in.createStringArrayList();
        printings = in.createStringArrayList();
        originalText = in.readString();
        originalType = in.readString();
        id = in.readString();
    }

    public static final Creator<Card> CREATOR = new Creator<Card>() {
        @Override
        public Card createFromParcel(Parcel in) {
            return new Card(in);
        }

        @Override
        public Card[] newArray(int size) {
            return new Card[size];
        }
    };

    public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getManaCost() {
            return manaCost;
        }

        public void setManaCost(String manaCost) {
            this.manaCost = manaCost;
        }

        public Integer getCmc() {
            return cmc;
        }

        public void setCmc(Integer cmc) {
            this.cmc = cmc;
        }

        public List<String> getColors() {
            return colors;
        }

        public void setColors(List<String> colors) {
            this.colors = colors;
        }

        public List<String> getColorIdentity() {
            return colorIdentity;
        }

        public void setColorIdentity(List<String> colorIdentity) {
            this.colorIdentity = colorIdentity;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public List<String> getTypes() {
            return types;
        }

        public void setTypes(List<String> types) {
            this.types = types;
        }

        public List<String> getSubtypes() {
            return subtypes;
        }

        public void setSubtypes(List<String> subtypes) {
            this.subtypes = subtypes;
        }

        public String getRarity() {
            return rarity;
        }

        public void setRarity(String rarity) {
            this.rarity = rarity;
        }

        public String getSet() {
            return set;
        }

        public void setSet(String set) {
            this.set = set;
        }

        public String getSetName() {
            return setName;
        }

        public void setSetName(String setName) {
            this.setName = setName;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getArtist() {
            return artist;
        }

        public void setArtist(String artist) {
            this.artist = artist;
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public String getPower() {
            return power;
        }

        public void setPower(String power) {
            this.power = power;
        }

        public String getToughness() {
            return toughness;
        }

        public void setToughness(String toughness) {
            this.toughness = toughness;
        }

        public String getLayout() {
            return layout;
        }

        public void setLayout(String layout) {
            this.layout = layout;
        }

        public String getMultiverseid() {
            return multiverseid;
        }

        public void setMultiverseid(String multiverseid) {
            this.multiverseid = multiverseid;
        }

        public String getImageUrl() {
            return imageUrl;
        }

        public void setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
        }

        public List<String> getVariations() {
            return variations;
        }

        public void setVariations(List<String> variations) {
            this.variations = variations;
        }

//        public List<ForeignName> getForeignNames() {
//            return foreignNames;
//        }
//
//        public void setForeignNames(List<ForeignName> foreignNames) {
//            this.foreignNames = foreignNames;
//        }

        public List<String> getPrintings() {
            return printings;
        }

        public void setPrintings(List<String> printings) {
            this.printings = printings;
        }

        public String getOriginalText() {
            return originalText;
        }

        public void setOriginalText(String originalText) {
            this.originalText = originalText;
        }

        public String getOriginalType() {
            return originalType;
        }

        public void setOriginalType(String originalType) {
            this.originalType = originalType;
        }

//        public List<Legality> getLegalities() {
//            return legalities;
//        }
//
//        public void setLegalities(List<Legality> legalities) {
//            this.legalities = legalities;
//        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public int getImagem() { return imagem; }

        public void setImagem(int imagem) { this.imagem = imagem; }
    @Override
    public String toString() {
        return "Card{" +
                "name='" + name + '\'' +
                ", manaCost='" + manaCost + '\'' +
                ", cmc=" + cmc +
                ", colors=" + colors +
                ", colorIdentity=" + colorIdentity +
                ", type='" + type + '\'' +
                ", types=" + types +
                ", subtypes=" + subtypes +
                ", rarity='" + rarity + '\'' +
                ", set='" + set + '\'' +
                ", setName='" + setName + '\'' +
                ", text='" + text + '\'' +
                ", artist='" + artist + '\'' +
                ", number='" + number + '\'' +
                ", power='" + power + '\'' +
                ", toughness='" + toughness + '\'' +
                ", layout='" + layout + '\'' +
                ", multiverseid='" + multiverseid + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", variations=" + variations +
                ", printings=" + printings +
                ", originalText='" + originalText + '\'' +
                ", originalType='" + originalType + '\'' +
                ", id='" + id + '\'' +
                '}';
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(manaCost);
        if (cmc == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(cmc);
        }
        dest.writeStringList(colors);
        dest.writeStringList(colorIdentity);
        dest.writeString(type);
        dest.writeStringList(types);
        dest.writeStringList(subtypes);
        dest.writeString(rarity);
        dest.writeString(set);
        dest.writeString(setName);
        dest.writeString(text);
        dest.writeString(artist);
        dest.writeString(number);
        dest.writeString(power);
        dest.writeString(toughness);
        dest.writeString(layout);
        dest.writeString(multiverseid);
        dest.writeString(imageUrl);
        dest.writeStringList(variations);
        dest.writeStringList(printings);
        dest.writeString(originalText);
        dest.writeString(originalType);
        dest.writeString(id);
    }
}

class ForeignName {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("flavor")
    @Expose
    private String flavor;
    @SerializedName("imageUrl")
    @Expose
    private String imageUrl;
    @SerializedName("language")
    @Expose
    private String language;
    @SerializedName("multiverseid")
    @Expose
    private Integer multiverseid;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Integer getMultiverseid() {
        return multiverseid;
    }

    public void setMultiverseid(Integer multiverseid) {
        this.multiverseid = multiverseid;
    }

    @Override
    public String toString() {
        return "ForeignName{" +
                "name='" + name + '\'' +
                ", text='" + text + '\'' +
                ", type='" + type + '\'' +
                ", flavor='" + flavor + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", language='" + language + '\'' +
                ", multiverseid=" + multiverseid +
                '}';
    }
}

 class Legality {

    @SerializedName("format")
    @Expose
    private String format;
    @SerializedName("legality")
    @Expose
    private String legality;

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getLegality() {
        return legality;
    }

    public void setLegality(String legality) {
        this.legality = legality;
    }

     @Override
     public String toString() {
         return "Legality{" +
                 "format='" + format + '\'' +
                 ", legality='" + legality + '\'' +
                 '}';
     }
 }