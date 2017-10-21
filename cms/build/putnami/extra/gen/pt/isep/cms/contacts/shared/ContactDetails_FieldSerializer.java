package pt.isep.cms.contacts.shared;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class ContactDetails_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getDisplayName(pt.isep.cms.contacts.shared.ContactDetails instance) /*-{
    return instance.@pt.isep.cms.contacts.shared.ContactDetails::displayName;
  }-*/;
  
  private static native void setDisplayName(pt.isep.cms.contacts.shared.ContactDetails instance, java.lang.String value) 
  /*-{
    instance.@pt.isep.cms.contacts.shared.ContactDetails::displayName = value;
  }-*/;
  
  private static native java.lang.String getId(pt.isep.cms.contacts.shared.ContactDetails instance) /*-{
    return instance.@pt.isep.cms.contacts.shared.ContactDetails::id;
  }-*/;
  
  private static native void setId(pt.isep.cms.contacts.shared.ContactDetails instance, java.lang.String value) 
  /*-{
    instance.@pt.isep.cms.contacts.shared.ContactDetails::id = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, pt.isep.cms.contacts.shared.ContactDetails instance) throws SerializationException {
    setDisplayName(instance, streamReader.readString());
    setId(instance, streamReader.readString());
    
  }
  
  public static pt.isep.cms.contacts.shared.ContactDetails instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new pt.isep.cms.contacts.shared.ContactDetails();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, pt.isep.cms.contacts.shared.ContactDetails instance) throws SerializationException {
    streamWriter.writeString(getDisplayName(instance));
    streamWriter.writeString(getId(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return pt.isep.cms.contacts.shared.ContactDetails_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    pt.isep.cms.contacts.shared.ContactDetails_FieldSerializer.deserialize(reader, (pt.isep.cms.contacts.shared.ContactDetails)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    pt.isep.cms.contacts.shared.ContactDetails_FieldSerializer.serialize(writer, (pt.isep.cms.contacts.shared.ContactDetails)object);
  }
  
}
