package org.tensorflow.codelabs.objectdetection;

import java.util.Map;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PartMap;

public interface ImageUploadingAPI {
    @FormUrlEncoded
    @Multipart
    @POST("/uploadimage")
    Call<Resultlist> getRectCordinates(
            //@Url String url,
            @PartMap Map<String, RequestBody> partMap
        /*    @Field("IMG_CROPPER") String img_cropper ,
            @Field("MOD_ID") String mod_id,
            @Field("USR_ID") int usr_id,
            @Field("IMAGE_TYPE") String image_type,
            @Field("AK") String ak,
            @Field("IMAGE") String image,
            @Field("IMG_ORG_HEIGHT") String img_org_height,
            @Field("IMG_ORG_WIDTH") String img_org_width,
            @Field("IMG_ENLARGE_BOX") String img_enlarge_box,
            @Field("IMG_REDUCED_DIM") String img_reduced_dim,
            @Field("UPLOADED_BY") String uploaded_by*/
    );
}
