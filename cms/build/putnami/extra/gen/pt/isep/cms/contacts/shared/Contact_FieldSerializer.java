package pt.isep.cms.contacts.shared;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class Contact_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, pt.isep.cms.contacts.shared.Contact instance) throws SerializationException {
    instance.emailAddress = streamReader.readString();
    instance.firstName = streamReader.readString();
    instance.id = streamReader.readString();
    instance.lastName = streamReader.readString();
    
  }
  
  public static pt.isep.cms.contacts.shared.Contact instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new pt.isep.cms.contacts.shared.Contact();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, pt.isep.cms.contacts.shared.Contact instance) throws SerializationException {
    streamWriter.writeString(instance.emailAddress);
    streamWriter.writeString(instance.firstName);
    streamWriter.writeString(instance.id);
    streamWriter.writeString(instance.lastName);
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return pt.isep.cms.contacts.shared.Contact_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    pt.isep.cms.contacts.shared.Contact_FieldSerializer.deserialize(reader, (pt.isep.cms.contacts.shared.Contact)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    pt.isep.cms.contacts.shared.Contact_FieldSerializer.serialize(writer, (pt.isep.cms.contacts.shared.Contact)object);
  }
  
}
