package com.cisco.apicem.model.sample_jsonunit_test;

import static net.javacrumbs.jsonunit.core.Option.IGNORING_ARRAY_ORDER;
import static net.javacrumbs.jsonunit.core.Option.IGNORING_EXTRA_ARRAY_ITEMS;

import com.fasterxml.jackson.databind.ObjectMapper;

import net.javacrumbs.jsonunit.core.Configuration;
import net.javacrumbs.jsonunit.core.internal.Diff;

/**
 * Hello world!
 *
 */
public class JsonUnitTest {
    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();
        
      //Diff d = Diff.create(mapper.writeValueAsString(a), mapper.writeValueAsString(b), "fullJson", "",
        //        Configuration.empty().withOptions(IGNORING_ARRAY_ORDER));
        
        String jsonL1 = "{\"foo\": 1}";
        String jsonR1 = "{\"foo\": 2}";
        

        String jsonL2 = "{ \"foo\": [ \"bar\", \"qux\", \"baz\" ] }";
        String jsonR2 = "{ \"foo\": [ \"qux2\", \"baz\", \"bar\" ] }";
        
        
        String jsonL3 = "{\n" + 
                "    \"fruit\": \"Apple\",\n" + 
                "    \"size\": \"Large\",\n" + 
                "    \"color\": \"Red\",\n" + 
                "    \"carray\" : [1, 2, 4, \"red\", \"blue\"]\n" + 
                "}";
        
        String jsonR3 = "{\n" + 
                "    \"fruit\": \"Apple\",\n" + 
                "    \"size\": \"Large\",\n" + 
                "    \"color\": \"Orange\",\n" + 
                "    \"carray\" : [\"red\",1, 2, 4, \"voilet\", \"blue\"]\n" + 
                "}";
        
        
        String jsonL4 = "{\n" + 
                "        \"@class\": \"com.cisco.esa.model.Deployment\",\n" + 
                "        \"instanceUuid\": \"03c96a18-6c80-40da-9f3c-5c01dab4379a\",\n" + 
                "        \"instanceId\": 309310,\n" + 
                "        \"authEntityId\": 82082,\n" + 
                "        \"displayName\": \"2d84d9b0[82082_82082,floor4-devtag1-isrv]\",\n" + 
                "        \"authEntityClass\": -927529445,\n" + 
                "        \"deployPending\": \"NONE\",\n" + 
                "        \"instanceVersion\": 0,\n" + 
                "        \"name\": \"floor4-devtag1-isrv\",\n" + 
                "        \"owningEntityId\": \"82082_82082\",\n" + 
                "        \"adminRules\": [\"java.util.HashSet\", [{\n" + 
                "                \"@class\": \"com.cisco.esa.model.Rule\",\n" + 
                "                \"instanceUuid\": \"50806549-8dd7-4052-9316-88106a1b57fe\",\n" + 
                "                \"action\": [\"java.util.HashSet\", []],\n" + 
                "                \"eventName\": \"VM_ALIVE\"\n" + 
                "        }]]\n" + 
                "}";
        
        String jsonR4 = "{\n" + 
                "        \"@class\": \"com.cisco.esa.model.Deployment\",\n" + 
                "        \"instanceUuid\": \"03c96a18-6c80-40da-9f3c-5c01dab4379a\",\n" + 
                "        \"instanceId\": 309310,\n" + 
                "        \"authEntityId\": 82082,\n" + 
                "        \"displayName\": \"2d84d9b0[82082_82082,floor4-devtag1-isrv]\",\n" + 
                "        \"authEntityClass\": -927529445,\n" + 
                "        \"deployPending\": \"NONE\",\n" + 
                "        \"instanceVersion\": 0,\n" + 
                "        \"name\": \"floor4-devtag1-isrv\",\n" + 
                "        \"owningEntityId\": \"82082_82082\",\n" + 
                "        \"adminRules\": [\"java.util.HashSet\", [{\n" + 
                "                \"@class\": \"com.cisco.esa.model.Rule\",\n" + 
                "                \"instanceUuid\": \"50806549-8dd7-4052-9316-88106a1b57fe\",\n" + 
                "                \"action\": [\"java.util.HashSet\", [\"ALWAYS log\", \"TRUE servicebooted.sh\", \"FALSE recover autohealing\"]],\n" + 
                "                \"eventName\": \"VM_ALIVE2\"\n" + 
                "        }]]\n" + 
                "}";
        
        
        String aclJsonL = "{\n" + 
                "  \"@class\": \"com.cisco.xmp.model.managed.vendorSpecificTechnologies.cisco.acl.ACL\",\n" + 
                "  \"instanceUuid\": \"b01062c7-c7fd-4002-8173-c03e2e3c4871\",\n" + 
                "  \"instanceId\": 106106,\n" + 
                "  \"authEntityId\": 81081,\n" + 
                "  \"displayName\": \"128aaca5[81081_81081,CISCO-CWA-URL-REDIRECT-ACL]\",\n" + 
                "  \"authEntityClass\": -927529445,\n" + 
                "  \"deployPending\": \"NONE\",\n" + 
                "  \"instanceVersion\": 0,\n" + 
                "  \"name\": \"CISCO-CWA-URL-REDIRECT-ACL\",\n" + 
                "  \"owningEntityId\": \"81081_81081\",\n" + 
                "  \"aclType\": \"EXTENDED\",\n" + 
                "  \"ipType\": \"IP_V4\",\n" + 
                "  \"isNamedAcl\": true,\n" + 
                "  \"aclEntry\": [\n" + 
                "    \"java.util.ArrayList\",\n" + 
                "    [\n" + 
                "      {\n" + 
                "        \"@class\": \"com.cisco.xmp.model.managed.vendorSpecificTechnologies.cisco.acl.AccessControlListEntry\",\n" + 
                "        \"instanceUuid\": \"22137ff1-a1dd-4a13-a304-27776a25f1ee\",\n" + 
                "        \"instanceId\": 103103,\n" + 
                "        \"authEntityId\": 81081,\n" + 
                "        \"displayName\": \"6c214544[81081_81081,CISCO-CWA-URL-REDIRECT-ACL,100]\",\n" + 
                "        \"authEntityClass\": -927529445,\n" + 
                "        \"deployPending\": \"NONE\",\n" + 
                "        \"instanceVersion\": 0,\n" + 
                "        \"owningEntityId\": \"81081_81081\",\n" + 
                "        \"aclName\": \"CISCO-CWA-URL-REDIRECT-ACL\",\n" + 
                "        \"action\": \"DENY\",\n" + 
                "        \"sequenceNumber\": 100,\n" + 
                "        \"accessControlList\": \"b01062c7-c7fd-4002-8173-c03e2e3c4871\",\n" + 
                "        \"aclCondition\": [\n" + 
                "          \"java.util.HashSet\",\n" + 
                "          [\n" + 
                "            {\n" + 
                "              \"@class\": \"com.cisco.xmp.model.managed.vendorSpecificTechnologies.cisco.acl.AclAddressCondition\",\n" + 
                "              \"instanceUuid\": \"5d6b7dcf-277d-480b-8372-7e3ba8426a1c\",\n" + 
                "              \"instanceId\": 100102,\n" + 
                "              \"authEntityId\": 81081,\n" + 
                "              \"displayName\": \"17870c10[81081_81081,CISCO-CWA-URL-REDIRECT-ACL,100,DESTINATION]\",\n" + 
                "              \"authEntityClass\": -927529445,\n" + 
                "              \"deployPending\": \"NONE\",\n" + 
                "              \"instanceVersion\": 0,\n" + 
                "              \"owningEntityId\": \"81081_81081\",\n" + 
                "              \"aclName\": \"CISCO-CWA-URL-REDIRECT-ACL\",\n" + 
                "              \"sequenceNumber\": 100,\n" + 
                "              \"aclEntry\": \"22137ff1-a1dd-4a13-a304-27776a25f1ee\",\n" + 
                "              \"address\": {\n" + 
                "                \"@class\": \"com.cisco.xmp.model.managed.vendorSpecificTechnologies.cisco.accessControlList.AclIpAddressAndMask\",\n" + 
                "                \"instanceUuid\": \"1d396b3e-4034-4686-9565-374fa47ab4a3\",\n" + 
                "                \"isAny\": true,\n" + 
                "                \"isHostAddress\": false\n" + 
                "              },\n" + 
                "              \"addressRole\": \"DESTINATION\"\n" + 
                "            }\n" + 
                "          ]\n" + 
                "        ]\n" + 
                "      }\n" + 
                "    ]\n" + 
                "  ]\n" + 
                "}";
        
        String aclJsonR = "{\n" + 
                "  \"@class\": \"com.cisco.xmp.model.managed.vendorSpecificTechnologies.cisco.acl.ACL\",\n" + 
                "  \"instanceUuid\": \"b01062c7-c7fd-4002-8173-c03e2e3c4871\",\n" + 
                "  \"instanceId\": 106106,\n" + 
                "  \"authEntityId\": 81081,\n" + 
                "  \"displayName\": \"128aaca5[81081_81081,CISCO-CWA-URL-REDIRECT-ACL]\",\n" + 
                "  \"authEntityClass\": -927529445,\n" + 
                "  \"deployPending\": \"NONE\",\n" + 
                "  \"instanceVersion\": 0,\n" + 
                "  \"name\": \"CISCO-CWA-URL-REDIRECT-ACL\",\n" + 
                "  \"owningEntityId\": \"81081_81081\",\n" + 
                "  \"aclType\": \"EXTENDED\",\n" + 
                "  \"ipType\": \"IP_V4\",\n" + 
                "  \"isNamedAcl\": true,\n" + 
                "  \"aclEntry\": [\n" + 
                "    \"java.util.ArrayList\",\n" + 
                "    [\n" + 
                "      {\n" + 
                "        \"@class\": \"com.cisco.xmp.model.managed.vendorSpecificTechnologies.cisco.acl.AccessControlListEntry\",\n" + 
                "        \"instanceUuid\": \"22137ff1-a1dd-4a13-a304-27776a25f1ee\",\n" + 
                "        \"instanceId\": 103103,\n" + 
                "        \"authEntityId\": 81081,\n" + 
                "        \"displayName\": \"6c214544[81081_81081,CISCO-CWA-URL-REDIRECT-ACL,100]\",\n" + 
                "        \"authEntityClass\": -927529445,\n" + 
                "        \"deployPending\": \"NONE\",\n" + 
                "        \"instanceVersion\": 0,\n" + 
                "        \"owningEntityId\": \"81081_81081\",\n" + 
                "        \"aclName\": \"CISCO-CWA-URL-REDIRECT-ACL\",\n" + 
                "        \"action\": \"DENY\",\n" + 
                "        \"sequenceNumber\": 100,\n" + 
                "        \"accessControlList\": \"b01062c7-c7fd-4002-8173-c03e2e3c4871\",\n" + 
                "        \"aclCondition\": [\n" + 
                "          \"java.util.HashSet\",\n" + 
                "          [\n" + 
                "            {\n" + 
                "              \"@class\": \"com.cisco.xmp.model.managed.vendorSpecificTechnologies.cisco.acl.AclAddressCondition\",\n" + 
                "              \"instanceUuid\": \"5d6b7dcf-277d-480b-8372-7e3ba8426a1c\",\n" + 
                "              \"instanceId\": 100102,\n" + 
                "              \"authEntityId\": 81081,\n" + 
                "              \"displayName\": \"17870c10[81081_81081,CISCO-CWA-URL-REDIRECT-ACL,100,DESTINATION]\",\n" + 
                "              \"authEntityClass\": -927529445,\n" + 
                "              \"deployPending\": \"NONE\",\n" + 
                "              \"instanceVersion\": 0,\n" + 
                "              \"owningEntityId\": \"81081_81081\",\n" + 
                "              \"aclName\": \"CISCO-CWA-URL-REDIRECT-ACL-test\",\n" + 
                "              \"sequenceNumber\": 100,\n" + 
                "              \"aclEntry\": \"22137ff1-a1dd-4a13-a304-27776a25f1ee\",\n" + 
                "              \"address\": {\n" + 
                "                \"@class\": \"com.cisco.xmp.model.managed.vendorSpecificTechnologies.cisco.accessControlList.AclIpAddressAndMask\",\n" + 
                "                \"instanceUuid\": \"1d396b3e-4034-4686-9565-374fa47ab4a3\",\n" + 
                "                \"isAny\": true,\n" + 
                "                \"isHostAddress\": false\n" + 
                "              },\n" + 
                "              \"addressRole\": \"DESTINATION\"\n" + 
                "            },\n" + 
                "            {\n" + 
                "              \"@class\": \"com.cisco.xmp.model.managed.vendorSpecificTechnologies.cisco.acl.AclAddressCondition\",\n" + 
                "              \"instanceUuid\": \"5cbac927-436b-4404-a9d3-f0a2dc944c68\",\n" + 
                "              \"instanceId\": 100111,\n" + 
                "              \"authEntityId\": 81081,\n" + 
                "              \"displayName\": \"17870c10[81081_81081,CISCO-CWA-URL-REDIRECT-ACL,100,SOURCE]\",\n" + 
                "              \"authEntityClass\": -927529445,\n" + 
                "              \"deployPending\": \"NONE\",\n" + 
                "              \"instanceVersion\": 0,\n" + 
                "              \"owningEntityId\": \"81081_81081\",\n" + 
                "              \"aclName\": \"CISCO-CWA-URL-REDIRECT-ACL\",\n" + 
                "              \"sequenceNumber\": 100,\n" + 
                "              \"aclEntry\": \"22137ff1-a1dd-4a13-a304-27776a25f1ee\",\n" + 
                "              \"address\": {\n" + 
                "                \"@class\": \"com.cisco.xmp.model.managed.vendorSpecificTechnologies.cisco.accessControlList.AclIpAddressAndMask\",\n" + 
                "                \"instanceUuid\": \"9770982c-4604-44fd-b4c1-a318ab0b6a87\",\n" + 
                "                \"isAny\": true,\n" + 
                "                \"isHostAddress\": false\n" + 
                "              },\n" + 
                "              \"addressRole\": \"SOURCE\"\n" + 
                "            }\n" + 
                "          ]\n" + 
                "        ]\n" + 
                "      }\n" + 
                "    ]\n" + 
                "  ]\n" + 
                "}";
        
        
        Diff d = Diff.create(aclJsonL, aclJsonR, "fullJson", "",
                      Configuration.empty().withOptions(IGNORING_ARRAY_ORDER, IGNORING_EXTRA_ARRAY_ITEMS));
        
        System.out.println(d.differences());
    }

}
