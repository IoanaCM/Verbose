package com.example.verbose;

public class Word {

    private String mRomanianTranslation;

    private String mEnglishTranslation;

    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    private int mAudioResourceId;

    public Word(String RomanianTranslation, String EnglishTranslation, int ImageResourceId, int AudioResourceId)
    {
        mRomanianTranslation = RomanianTranslation;
        mEnglishTranslation = EnglishTranslation;
        mImageResourceId = ImageResourceId;
        mAudioResourceId = AudioResourceId;
    }
    public Word(String RomanianTranslation, String EnglishTranslation, int AudioResourceId)
    {
        mRomanianTranslation = RomanianTranslation;
        mEnglishTranslation = EnglishTranslation;
        mAudioResourceId =AudioResourceId;

    }

    public Word(String RomanianTranslation, String EnglishTranslation)
    {
        mRomanianTranslation = RomanianTranslation;
        mEnglishTranslation = EnglishTranslation;
    }

    public String getRomanianTranslation(){
     return mRomanianTranslation;
    }
    public String getEnglishTranslation(){
        return mEnglishTranslation;
    }
    public int getImageResourceId(){
        return mImageResourceId;
    }
    public int getAudioResourceId(){
        return mAudioResourceId;
    }

    public boolean hasImage(){
        return mImageResourceId!=NO_IMAGE_PROVIDED;
    }

}
