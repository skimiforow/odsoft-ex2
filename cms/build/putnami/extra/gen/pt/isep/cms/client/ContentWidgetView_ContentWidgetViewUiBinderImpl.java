// .ui.xml template last modified: 1507564360000
package pt.isep.cms.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.safehtml.client.SafeHtmlTemplates;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.safehtml.shared.SafeUri;
import com.google.gwt.safehtml.shared.UriUtils;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class ContentWidgetView_ContentWidgetViewUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, pt.isep.cms.client.ContentWidgetView>, pt.isep.cms.client.ContentWidgetView.ContentWidgetViewUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("<span class='{0}' id='{1}'>Name</span> <span class='{2}' id='{3}'>Description</span>")
    SafeHtml html1(String arg0, String arg1, String arg2, String arg3);
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final pt.isep.cms.client.ContentWidgetView owner) {


    return new Widgets(owner).get_f_HeaderPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final pt.isep.cms.client.ContentWidgetView owner;


    public Widgets(final pt.isep.cms.client.ContentWidgetView owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
      build_domId0();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 3
      build_domId1();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 3
    }

    SafeHtml template_html1() {
      return template.html1("" + get_style().name() + "", get_domId0(), "" + get_style().description() + "", get_domId1());
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private pt.isep.cms.client.ContentWidgetView_ContentWidgetViewUiBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private pt.isep.cms.client.ContentWidgetView_ContentWidgetViewUiBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final pt.isep.cms.client.ContentWidgetView_ContentWidgetViewUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (pt.isep.cms.client.ContentWidgetView_ContentWidgetViewUiBinderImpl_GenBundle) GWT.create(pt.isep.cms.client.ContentWidgetView_ContentWidgetViewUiBinderImpl_GenBundle.class);
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 3 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private pt.isep.cms.client.ContentWidgetView_ContentWidgetViewUiBinderImpl_GenCss_style style;
    private pt.isep.cms.client.ContentWidgetView_ContentWidgetViewUiBinderImpl_GenCss_style get_style() {
      return style;
    }
    private pt.isep.cms.client.ContentWidgetView_ContentWidgetViewUiBinderImpl_GenCss_style build_style() {
      // Creation section.
      style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
      // Setup section.
      style.ensureInjected();

      return style;
    }

    /**
     * Getter for f_HeaderPanel1 called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private com.google.gwt.user.client.ui.HeaderPanel get_f_HeaderPanel1() {
      return build_f_HeaderPanel1();
    }
    private com.google.gwt.user.client.ui.HeaderPanel build_f_HeaderPanel1() {
      // Creation section.
      final com.google.gwt.user.client.ui.HeaderPanel f_HeaderPanel1 = (com.google.gwt.user.client.ui.HeaderPanel) GWT.create(com.google.gwt.user.client.ui.HeaderPanel.class);
      // Setup section.
      f_HeaderPanel1.add(get_f_HTMLPanel2());
      f_HeaderPanel1.add(get_cwPanel());

      return f_HeaderPanel1;
    }

    /**
     * Getter for f_HTMLPanel2 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_f_HTMLPanel2() {
      return build_f_HTMLPanel2();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_f_HTMLPanel2() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel2 = new com.google.gwt.user.client.ui.HTMLPanel(template_html1().asString());
      // Setup section.
      f_HTMLPanel2.setStyleName("" + get_style().contentTitle() + "");

      {
        // Attach section.
        UiBinderUtil.TempAttachment __attachRecord__ = UiBinderUtil.attachToDom(f_HTMLPanel2.getElement());

        get_nameElem();
        get_descElem();

        // Detach section.
        __attachRecord__.detach();
      }

      return f_HTMLPanel2;
    }

    /**
     * Getter for nameElem called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.dom.client.SpanElement get_nameElem() {
      return build_nameElem();
    }
    private com.google.gwt.dom.client.SpanElement build_nameElem() {
      // Creation section.
      final com.google.gwt.dom.client.SpanElement nameElem = new com.google.gwt.uibinder.client.LazyDomElement(get_domId0()).get().cast();
      // Setup section.

      this.owner.nameElem = nameElem;

      return nameElem;
    }

    /**
     * Getter for domId0 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 3.
     */
    private java.lang.String domId0;
    private java.lang.String get_domId0() {
      return domId0;
    }
    private java.lang.String build_domId0() {
      // Creation section.
      domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.

      return domId0;
    }

    /**
     * Getter for descElem called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.dom.client.SpanElement get_descElem() {
      return build_descElem();
    }
    private com.google.gwt.dom.client.SpanElement build_descElem() {
      // Creation section.
      final com.google.gwt.dom.client.SpanElement descElem = new com.google.gwt.uibinder.client.LazyDomElement(get_domId1()).get().cast();
      // Setup section.

      this.owner.descElem = descElem;

      return descElem;
    }

    /**
     * Getter for domId1 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 3.
     */
    private java.lang.String domId1;
    private java.lang.String get_domId1() {
      return domId1;
    }
    private java.lang.String build_domId1() {
      // Creation section.
      domId1 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.

      return domId1;
    }

    /**
     * Getter for cwPanel called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.SimplePanel get_cwPanel() {
      return build_cwPanel();
    }
    private com.google.gwt.user.client.ui.SimplePanel build_cwPanel() {
      // Creation section.
      final com.google.gwt.user.client.ui.SimplePanel cwPanel = owner.cwPanel;
      assert cwPanel != null : "UiField cwPanel with 'provided = true' was null";
      // Setup section.

      return cwPanel;
    }
  }
}
