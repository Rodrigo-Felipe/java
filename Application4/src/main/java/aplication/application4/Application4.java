/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package aplication.application4;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author rodrigofelipe
 */
public class Application4 {

    public static void main(String[] args) {
        Map<String, String> cookies = new TreeMap<>();

        cookies.put("usarname", "Maria");
        cookies.put("email", "Maria@gmail.com");
        cookies.put("phone", "9999999999");

        cookies.remove("email");
        cookies.put("phone", "99771133");
        System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
        System.out.println("Phone number: " + cookies.get("phone"));
        System.out.println("Email: " + cookies.get("email"));
        System.out.println("Size: " + cookies.size());

        System.out.println("All cookies: ");
        for (String key : cookies.keySet()) {
            System.out.println(key + ":" + cookies.get(key));

        }
    }
}
