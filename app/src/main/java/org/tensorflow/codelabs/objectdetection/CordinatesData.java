package org.tensorflow.codelabs.objectdetection;

import java.util.HashMap;
import java.util.Map;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CordinatesData {
    private ImageUploadingAPI imageUploadingAPI = ImageUploadingRetrofitClient.getClient().create(ImageUploadingAPI.class);

    void getCordinatesData(String encodedImageString,String trghgt,String trgwdt) {
        int user_id = 103293041;
        RequestBody img_cropper = RequestBody.create(MediaType.parse("text/plain"),"1");
        RequestBody mod_id = RequestBody.create(MediaType.parse("text/plain"),"ANDROID");
        RequestBody usr_id = RequestBody.create(MediaType.parse("text/plain"), String.valueOf(user_id));
        RequestBody image_type = RequestBody.create(MediaType.parse("text/plain"),"DEFAULT");
        RequestBody ak = RequestBody.create(MediaType.parse("text/plain"),"eyJ0eXAiOiJKV1QiLCJhbGciOiJzaGEyNTYifQ.eyJpc3MiOiJVU0VSIiwiYXVkIjoiNio4KjEqOSo5KiIsImV4cCI6MTY1Mjc3MzQ3NywiaWF0IjoxNjUyNjg3MDc3LCJzdWIiOiIxMDMyOTMwNDEiLCJjZHQiOiIxNi0wNS0yMDIyIn0.I5z6nCZ4K4PPMZg_NkP8ceDfpvRlKaNkoP6EaDqQlSE");
        RequestBody image = RequestBody.create(MediaType.parse("text/plain"),encodedImageString);
        RequestBody img_org_height= RequestBody.create(MediaType.parse("text/plain"),trghgt);
        RequestBody img_org_width = RequestBody.create(MediaType.parse("text/plain"),trgwdt);
        RequestBody img_enlarge_box = RequestBody.create(MediaType.parse("text/plain"),"40");
        RequestBody img_reduced_dim = RequestBody.create(MediaType.parse("text/plain"),"256");
        RequestBody uploaded_by = RequestBody.create(MediaType.parse("text/plain"), String.valueOf(user_id));

        Map<String, RequestBody> map = new HashMap<>();
        map.put("img_cropper", img_cropper);
        map.put("mod_id", mod_id);
        map.put("usr_id", usr_id);
        map.put("image_type", image_type);
        map.put("ak", ak);
        map.put("image",image);
        map.put("img_org_height", img_org_height);
        map.put("img_org_width", img_org_width);
        map.put("img_enlarge_box", img_enlarge_box);
        map.put("img_reduced_dim",img_reduced_dim);
        map.put("uploaded_by", uploaded_by);

        Call<Resultlist> resultList = imageUploadingAPI.getRectCordinates(map );
        resultList.enqueue(new Callback<Resultlist>() {
            @Override
            public void onResponse(Call<Resultlist> call, Response<Resultlist> response) {
                Resultlist list = response.body();
            }

            @Override
            public void onFailure(Call<Resultlist> call, Throwable t) {
            }
        });
    }
}
