package org.example.stack74956508;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.math.BigDecimal;

public class MoneySerializer extends JsonSerializer<BigDecimal> {



    @Override
    public void serialize(BigDecimal bigDecimal, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        String fieldName = jsonGenerator.getOutputContext().getCurrentName();
        Class css = jsonGenerator.getOutputContext().getCurrentValue().getClass();
        boolean edit = false;
        try{
            MyAccuracy myAccuracy = css.getField(fieldName).getAnnotation(MyAccuracy.class);
            jsonGenerator.writeString(bigDecimal.setScale(myAccuracy.value(),BigDecimal.ROUND_HALF_UP).toPlainString());
            edit = true;
        }catch (Exception e){
            e.printStackTrace();
        }
        if(!edit) {
            jsonGenerator.writeString(bigDecimal.toPlainString());
        }
    }

}