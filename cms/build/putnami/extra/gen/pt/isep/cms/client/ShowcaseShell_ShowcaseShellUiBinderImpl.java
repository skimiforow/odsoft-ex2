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

public class ShowcaseShell_ShowcaseShellUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, pt.isep.cms.client.ShowcaseShell>, pt.isep.cms.client.ShowcaseShell.ShowcaseShellUiBinder {
  static ShowcaseShellShowcaseShellUiBinderImplGenMessages messages = (ShowcaseShellShowcaseShellUiBinderImplGenMessages) GWT.create(ShowcaseShellShowcaseShellUiBinderImplGenMessages.class);

  interface Template extends SafeHtmlTemplates {
    @Template("<table align='right' cellpadding='0' cellspacing='0' id='{0}'> <tr> <td class='{1}'> <a href='http://www.gwtproject.org/'> {2} </a> </td> </tr> </table>")
    SafeHtml html1(String arg0, String arg1, SafeHtml arg2);
     
    @Template("<table cellpadding='0' cellspacing='0' width='100%'> <tr> <td> <table cellpadding='0' cellspacing='0'> <tr> <td style='line-height:0px'> <span id='{0}'></span> </td> <td> <h1 class='{1}'> {2} </h1> <h2 class='{3}'> {4} </h2> </td> </tr> </table> </td> <td align='right' class='{5}' id='{6}' valign='top'> <table cellpadding='0' cellspacing='0'> <tr> <td valign='middle'> <span id='{7}'></span> </td> <td valign='middle'> <span id='{8}'></span> </td> </tr> </table> </td> </tr> </table>")
    SafeHtml html2(String arg0, String arg1, SafeHtml arg2, String arg3, SafeHtml arg4, String arg5, String arg6, String arg7, String arg8);
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final pt.isep.cms.client.ShowcaseShell owner) {


    return new Widgets(owner).get_f_DockLayoutPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final pt.isep.cms.client.ShowcaseShell owner;


    public Widgets(final pt.isep.cms.client.ShowcaseShell owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
      build_res();  // more than one getter call detected. Type: IMPORTED, precedence: 1
      build_domId0();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 3
      build_domId1();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 3
      build_domId2();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 3
      build_domId3();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 3
      build_domId4();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 3
      build_domId1Element();  // more than one getter call detected. Type: DEFAULT, precedence: 3
      build_domId3Element();  // more than one getter call detected. Type: DEFAULT, precedence: 3
      build_domId4Element();  // more than one getter call detected. Type: DEFAULT, precedence: 3
    }

    SafeHtml template_html1() {
      return template.html1(get_domId0(), "" + get_style().link() + "", SafeHtmlUtils.fromSafeConstant(messages.message1()));
    }
    SafeHtml template_html2() {
      return template.html2(get_domId1(), "" + get_style().title() + "", SafeHtmlUtils.fromSafeConstant(messages.message2()), "" + get_style().subtitle() + "", SafeHtmlUtils.fromSafeConstant(messages.message3()), "" + get_style().options() + "", get_domId2(), get_domId3(), get_domId4());
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private pt.isep.cms.client.ShowcaseShell_ShowcaseShellUiBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private pt.isep.cms.client.ShowcaseShell_ShowcaseShellUiBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final pt.isep.cms.client.ShowcaseShell_ShowcaseShellUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (pt.isep.cms.client.ShowcaseShell_ShowcaseShellUiBinderImpl_GenBundle) GWT.create(pt.isep.cms.client.ShowcaseShell_ShowcaseShellUiBinderImpl_GenBundle.class);
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for res called 2 times. Type: IMPORTED. Build precedence: 1.
     */
    private pt.isep.cms.client.ShowcaseResources res;
    private pt.isep.cms.client.ShowcaseResources get_res() {
      return res;
    }
    private pt.isep.cms.client.ShowcaseResources build_res() {
      // Creation section.
      res = (pt.isep.cms.client.ShowcaseResources) GWT.create(pt.isep.cms.client.ShowcaseResources.class);
      // Setup section.

      return res;
    }

    /**
     * Getter for style called 8 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private pt.isep.cms.client.ShowcaseShell_ShowcaseShellUiBinderImpl_GenCss_style style;
    private pt.isep.cms.client.ShowcaseShell_ShowcaseShellUiBinderImpl_GenCss_style get_style() {
      return style;
    }
    private pt.isep.cms.client.ShowcaseShell_ShowcaseShellUiBinderImpl_GenCss_style build_style() {
      // Creation section.
      style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
      // Setup section.
      style.ensureInjected();

      return style;
    }

    /**
     * Getter for f_DockLayoutPanel1 called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private com.google.gwt.user.client.ui.DockLayoutPanel get_f_DockLayoutPanel1() {
      return build_f_DockLayoutPanel1();
    }
    private com.google.gwt.user.client.ui.DockLayoutPanel build_f_DockLayoutPanel1() {
      // Creation section.
      final com.google.gwt.user.client.ui.DockLayoutPanel f_DockLayoutPanel1 = new com.google.gwt.user.client.ui.DockLayoutPanel(com.google.gwt.dom.client.Style.Unit.PT);
      // Setup section.
      f_DockLayoutPanel1.addNorth(get_f_HTMLPanel2(), 12);
      f_DockLayoutPanel1.addNorth(get_f_HTMLPanel3(), 55);
      f_DockLayoutPanel1.add(get_f_DockLayoutPanel6());

      return f_DockLayoutPanel1;
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
      f_HTMLPanel2.setStyleName("" + get_style().linkBar() + "");

      {
        // Attach section.
        UiBinderUtil.TempAttachment __attachRecord__ = UiBinderUtil.attachToDom(f_HTMLPanel2.getElement());

        get_linkCell();

        // Detach section.
        __attachRecord__.detach();
      }

      return f_HTMLPanel2;
    }

    /**
     * Getter for linkCell called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.dom.client.TableElement get_linkCell() {
      return build_linkCell();
    }
    private com.google.gwt.dom.client.TableElement build_linkCell() {
      // Creation section.
      final com.google.gwt.dom.client.TableElement linkCell = new com.google.gwt.uibinder.client.LazyDomElement(get_domId0()).get().cast();
      // Setup section.

      this.owner.linkCell = linkCell;

      return linkCell;
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
     * Getter for f_HTMLPanel3 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_f_HTMLPanel3() {
      return build_f_HTMLPanel3();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_f_HTMLPanel3() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel3 = new com.google.gwt.user.client.ui.HTMLPanel(template_html2().asString());
      // Setup section.
      f_HTMLPanel3.setStyleName("" + get_style().titleBar() + "");

      {
        // Attach section.
        UiBinderUtil.TempAttachment __attachRecord__ = UiBinderUtil.attachToDom(f_HTMLPanel3.getElement());

        get_domId1Element().get();
        get_localeSelectionCell();
        get_domId3Element().get();
        get_domId4Element().get();

        // Detach section.
        __attachRecord__.detach();
      }
      f_HTMLPanel3.addAndReplaceElement(get_f_Image4(), get_domId1Element().get());
      f_HTMLPanel3.addAndReplaceElement(get_f_Image5(), get_domId3Element().get());
      f_HTMLPanel3.addAndReplaceElement(get_localeBox(), get_domId4Element().get());

      return f_HTMLPanel3;
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
     * Getter for f_Image4 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.Image get_f_Image4() {
      return build_f_Image4();
    }
    private com.google.gwt.user.client.ui.Image build_f_Image4() {
      // Creation section.
      final com.google.gwt.user.client.ui.Image f_Image4 = new com.google.gwt.user.client.ui.Image(get_res().isepLogo());
      // Setup section.

      return f_Image4;
    }

    /**
     * Getter for domId1Element called 2 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId1Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId1Element() {
      return domId1Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId1Element() {
      // Creation section.
      domId1Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId1());
      // Setup section.

      return domId1Element;
    }

    /**
     * Getter for localeSelectionCell called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.dom.client.TableCellElement get_localeSelectionCell() {
      return build_localeSelectionCell();
    }
    private com.google.gwt.dom.client.TableCellElement build_localeSelectionCell() {
      // Creation section.
      final com.google.gwt.dom.client.TableCellElement localeSelectionCell = new com.google.gwt.uibinder.client.LazyDomElement(get_domId2()).get().cast();
      // Setup section.

      this.owner.localeSelectionCell = localeSelectionCell;

      return localeSelectionCell;
    }

    /**
     * Getter for domId2 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 3.
     */
    private java.lang.String domId2;
    private java.lang.String get_domId2() {
      return domId2;
    }
    private java.lang.String build_domId2() {
      // Creation section.
      domId2 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.

      return domId2;
    }

    /**
     * Getter for domId3 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 3.
     */
    private java.lang.String domId3;
    private java.lang.String get_domId3() {
      return domId3;
    }
    private java.lang.String build_domId3() {
      // Creation section.
      domId3 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.

      return domId3;
    }

    /**
     * Getter for f_Image5 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.Image get_f_Image5() {
      return build_f_Image5();
    }
    private com.google.gwt.user.client.ui.Image build_f_Image5() {
      // Creation section.
      final com.google.gwt.user.client.ui.Image f_Image5 = new com.google.gwt.user.client.ui.Image(get_res().locale());
      // Setup section.

      return f_Image5;
    }

    /**
     * Getter for domId3Element called 2 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId3Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId3Element() {
      return domId3Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId3Element() {
      // Creation section.
      domId3Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId3());
      // Setup section.

      return domId3Element;
    }

    /**
     * Getter for domId4 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 3.
     */
    private java.lang.String domId4;
    private java.lang.String get_domId4() {
      return domId4;
    }
    private java.lang.String build_domId4() {
      // Creation section.
      domId4 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.

      return domId4;
    }

    /**
     * Getter for localeBox called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.ListBox get_localeBox() {
      return build_localeBox();
    }
    private com.google.gwt.user.client.ui.ListBox build_localeBox() {
      // Creation section.
      final com.google.gwt.user.client.ui.ListBox localeBox = (com.google.gwt.user.client.ui.ListBox) GWT.create(com.google.gwt.user.client.ui.ListBox.class);
      // Setup section.
      localeBox.addStyleName("" + get_style().localeBox() + "");

      this.owner.localeBox = localeBox;

      return localeBox;
    }

    /**
     * Getter for domId4Element called 2 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId4Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId4Element() {
      return domId4Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId4Element() {
      // Creation section.
      domId4Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId4());
      // Setup section.

      return domId4Element;
    }

    /**
     * Getter for f_DockLayoutPanel6 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.DockLayoutPanel get_f_DockLayoutPanel6() {
      return build_f_DockLayoutPanel6();
    }
    private com.google.gwt.user.client.ui.DockLayoutPanel build_f_DockLayoutPanel6() {
      // Creation section.
      final com.google.gwt.user.client.ui.DockLayoutPanel f_DockLayoutPanel6 = new com.google.gwt.user.client.ui.DockLayoutPanel(com.google.gwt.dom.client.Style.Unit.PX);
      // Setup section.
      f_DockLayoutPanel6.addLineStart(get_f_ScrollPanel7(), 225);
      f_DockLayoutPanel6.add(get_f_DockLayoutPanel8());

      return f_DockLayoutPanel6;
    }

    /**
     * Getter for f_ScrollPanel7 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.ScrollPanel get_f_ScrollPanel7() {
      return build_f_ScrollPanel7();
    }
    private com.google.gwt.user.client.ui.ScrollPanel build_f_ScrollPanel7() {
      // Creation section.
      final com.google.gwt.user.client.ui.ScrollPanel f_ScrollPanel7 = (com.google.gwt.user.client.ui.ScrollPanel) GWT.create(com.google.gwt.user.client.ui.ScrollPanel.class);
      // Setup section.
      f_ScrollPanel7.add(get_mainMenu());
      f_ScrollPanel7.setStyleName("" + get_style().mainMenu() + "");

      return f_ScrollPanel7;
    }

    /**
     * Getter for mainMenu called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.cellview.client.CellTree get_mainMenu() {
      return build_mainMenu();
    }
    private com.google.gwt.user.cellview.client.CellTree build_mainMenu() {
      // Creation section.
      final com.google.gwt.user.cellview.client.CellTree mainMenu = owner.mainMenu;
      assert mainMenu != null : "UiField mainMenu with 'provided = true' was null";
      // Setup section.

      return mainMenu;
    }

    /**
     * Getter for f_DockLayoutPanel8 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.DockLayoutPanel get_f_DockLayoutPanel8() {
      return build_f_DockLayoutPanel8();
    }
    private com.google.gwt.user.client.ui.DockLayoutPanel build_f_DockLayoutPanel8() {
      // Creation section.
      final com.google.gwt.user.client.ui.DockLayoutPanel f_DockLayoutPanel8 = new com.google.gwt.user.client.ui.DockLayoutPanel(com.google.gwt.dom.client.Style.Unit.PT);
      // Setup section.
      f_DockLayoutPanel8.add(get_contentPanel());

      return f_DockLayoutPanel8;
    }

    /**
     * Getter for contentPanel called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.SimpleLayoutPanel get_contentPanel() {
      return build_contentPanel();
    }
    private com.google.gwt.user.client.ui.SimpleLayoutPanel build_contentPanel() {
      // Creation section.
      final com.google.gwt.user.client.ui.SimpleLayoutPanel contentPanel = (com.google.gwt.user.client.ui.SimpleLayoutPanel) GWT.create(com.google.gwt.user.client.ui.SimpleLayoutPanel.class);
      // Setup section.

      this.owner.contentPanel = contentPanel;

      return contentPanel;
    }
  }
}
