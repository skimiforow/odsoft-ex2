package pt.isep.cms.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class ContentWidgetView_ContentWidgetViewUiBinderImpl_GenBundle_default_InlineClientBundleGenerator implements pt.isep.cms.client.ContentWidgetView_ContentWidgetViewUiBinderImpl_GenBundle {
  private static ContentWidgetView_ContentWidgetViewUiBinderImpl_GenBundle_default_InlineClientBundleGenerator _instance0 = new ContentWidgetView_ContentWidgetViewUiBinderImpl_GenBundle_default_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new pt.isep.cms.client.ContentWidgetView_ContentWidgetViewUiBinderImpl_GenCss_style() {
      public java.lang.String contentTitle() {
        return "AO2VSVD-d-a";
      }
      public java.lang.String description() {
        return "AO2VSVD-d-b";
      }
      private boolean injected;
      public boolean ensureInjected() {
        if (!injected) {
          injected = true;
          com.google.gwt.dom.client.StyleInjector.inject(getText());
          return true;
        }
        return false;
      }
      public String getName() {
        return "style";
      }
      public String getText() {
        return (".AO2VSVD-d-c{color:#4b4a4a;font-size:17pt;font-weight:bold;background-color:#d7dde8}.AO2VSVD-d-b{color:#4b4a4a;margin:0 10px 12px;background-color:#d7dde8}.AO2VSVD-d-a{background-color:#d7dde8;border-bottom:1px solid #c3c3c3;padding:0 10px}");
      }
      public java.lang.String name() {
        return "AO2VSVD-d-c";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static pt.isep.cms.client.ContentWidgetView_ContentWidgetViewUiBinderImpl_GenCss_style get() {
      return style;
    }
  }
  public pt.isep.cms.client.ContentWidgetView_ContentWidgetViewUiBinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static pt.isep.cms.client.ContentWidgetView_ContentWidgetViewUiBinderImpl_GenCss_style style;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      style(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("style", style());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'style': return this.@pt.isep.cms.client.ContentWidgetView_ContentWidgetViewUiBinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
