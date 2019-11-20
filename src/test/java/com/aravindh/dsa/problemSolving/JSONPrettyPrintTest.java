package com.aravindh.dsa.problemSolving;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

/**
 * Created by aravindhravindran on 14/12/17.
 */
@RunWith(value = JUnit4.class)
public class JSONPrettyPrintTest {
    JSONPrettyPrint prettifier = new JSONPrettyPrint();

    /*@Test(expected = IllegalArgumentException.class)
    public void prettifyJsonWithInvalidJSONThrowsIllegalArgumentException(){
        String jsonInput = "{A:\"B\",C:{D:\"E\",F:{G:\"H\",I:\"J\"";
        prettifier.prettifyJson(jsonInput,);
        jsonInput = "{A:\"B\",C:{D:\"E\",F:[G:\"H\",I:\"J\"}]}";
        prettifier.prettifyJson(jsonInput);
        jsonInput = "{A:\"B\",C:{D:\"E\",F:[G:\"H\",I:\"J\",}]}";
        prettifier.prettifyJson(jsonInput);
        jsonInput = "{A:\"B\",C:{D:\"E\",F:[G:\"H\",I:\"J\"}],}";
        prettifier.prettifyJson(jsonInput);
    }*/
    //{name:"name",age:25,phone:[1234567890, 9876543210],address:[home:{doorNo:"22A", street:"street", area:"area", city:"city", pin:641035}, office:{doorNo:"22A", street:"street", area:"area", city:"city", pin:641035}]}
    @Test
    public void prettifyJsonWithValidJSONReturnPrettifiedJSON(){
        String jsonInput = "{\"name\":\"name\",\"age\":25,\"phone\":[1234567890, 9876543210],\"address\":[{\"doorNo\":\"22A\", \"street\":\"street\", \"area\":\"area\", \"city\":\"city\", \"pin\":641035}, {\"doorNo\":\"22A\", \"street\":\"street\", \"area\":\"area\", \"city\":\"city\", \"pin\":641035}]}";
        String expectedJson = "{\n" +
                "\t\"name\": \"name\",\n" +
                "\t\"age\": 25,\n" +
                "\t\"phone\": [1234567890, 9876543210],\n" +
                "\t\"address\": [{\n" +
                "\t\t\"doorNo\": \"22A\",\n" +
                "\t\t\"street\": \"street\",\n" +
                "\t\t\"area\": \"area\",\n" +
                "\t\t\"city\": \"city\",\n" +
                "\t\t\"pin\": 641035\n" +
                "\t}, {\n" +
                "\t\t\"doorNo\": \"22A\",\n" +
                "\t\t\"street\": \"street\",\n" +
                "\t\t\"area\": \"area\",\n" +
                "\t\t\"city\": \"city\",\n" +
                "\t\t\"pin\": 641035\n" +
                "\t}]\n" +
                "}";
        System.out.println(expectedJson);
        //Assert.assertEquals(expectedJson, prettifier.prettifyJson(jsonInput, true));
    }

    @Test
    public void prettifyJsonWithValidListOfElementsJSONReturnPrettifiedJSON(){
        String jsonInput = "[{\"name\":\"name\",\"age\":25,\"phone\":[1234567890, 9876543210],\"address\":[{\"doorNo\":\"22A\", \"street\":\"street\", \"area\":\"area\", \"city\":\"city\", \"pin\":641035}, {\"doorNo\":\"22A\", \"street\":\"street\", \"area\":\"area\", \"city\":\"city\", \"pin\":641035}]}, {\"name\":\"name\",\"age\":25,\"phone\":[1234567890, 9876543210],\"address\":[{\"doorNo\":\"22A\", \"street\":\"street\", \"area\":\"area\", \"city\":\"city\", \"pin\":641035}, {\"doorNo\":\"22A\", \"street\":\"street\", \"area\":\"area\", \"city\":\"city\", \"pin\":641035}]}]";
        String expectedJson = "[{\n" +
                "\t\"name\": \"name\",\n" +
                "\t\"age\": 25,\n" +
                "\t\"phone\": [1234567890, 9876543210],\n" +
                "\t\"address\": [{\n" +
                "\t\t\"doorNo\": \"22A\",\n" +
                "\t\t\"street\": \"street\",\n" +
                "\t\t\"area\": \"area\",\n" +
                "\t\t\"city\": \"city\",\n" +
                "\t\t\"pin\": 641035\n" +
                "\t}, {\n" +
                "\t\t\"doorNo\": \"22A\",\n" +
                "\t\t\"street\": \"street\",\n" +
                "\t\t\"area\": \"area\",\n" +
                "\t\t\"city\": \"city\",\n" +
                "\t\t\"pin\": 641035\n" +
                "\t}]\n" +
                "}, {\n" +
                "\t\"name\": \"name\",\n" +
                "\t\"age\": 25,\n" +
                "\t\"phone\": [1234567890, 9876543210],\n" +
                "\t\"address\": [{\n" +
                "\t\t\"doorNo\": \"22A\",\n" +
                "\t\t\"street\": \"street\",\n" +
                "\t\t\"area\": \"area\",\n" +
                "\t\t\"city\": \"city\",\n" +
                "\t\t\"pin\": 641035\n" +
                "\t}, {\n" +
                "\t\t\"doorNo\": \"22A\",\n" +
                "\t\t\"street\": \"street\",\n" +
                "\t\t\"area\": \"area\",\n" +
                "\t\t\"city\": \"city\",\n" +
                "\t\t\"pin\": 641035\n" +
                "\t}]\n" +
                "}]";
        Assert.assertEquals(expectedJson, prettifier.prettifyJson(jsonInput, true));
    }

    @Test
    public void prettifyJsonWithEmptyElementJSONReturnPrettifiedJSON(){
        String jsonInput = "{}";
        String expectedJson = "{}";
        Assert.assertEquals(expectedJson, prettifier.prettifyJson(jsonInput, true));
    }

    @Test
    public void prettifyJsonWithEmptyListJSONReturnPrettifiedJSON(){
        String jsonInput = "[]";
        String expectedJson = "[]";
        Assert.assertEquals(expectedJson, prettifier.prettifyJson(jsonInput, true));
    }

    @Test
    public void prettifyJsonWithNestedElementsJSONReturnPrettifiedJSON(){
        String jsonInput = "{\"a\":{\"b\":{\"c\":{\"d\":\"d\"}},\"e\":\"e\"}}";
        String expectedJson = "{\n" +
                "\t\"a\": {\n" +
                "\t\t\"b\": {\n" +
                "\t\t\t\"c\": {\n" +
                "\t\t\t\t\"d\": \"d\"\n" +
                "\t\t\t}\n" +
                "\t\t},\n" +
                "\t\t\"e\": \"e\"\n" +
                "\t}\n" +
                "}";
        Assert.assertEquals(expectedJson, prettifier.prettifyJson(jsonInput, true));
    }

}