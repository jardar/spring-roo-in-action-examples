// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.

package org.rooinaction.coursemanager.client.managed.activity;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.place.shared.PlaceController;
import com.google.web.bindery.requestfactory.shared.EntityProxyId;
import com.google.web.bindery.requestfactory.shared.RequestContext;
import java.util.Set;
import org.rooinaction.coursemanager.client.managed.request.ApplicationRequestFactory;
import org.rooinaction.coursemanager.client.managed.ui.RegistrationSetEditor;
import org.rooinaction.coursemanager.client.managed.ui.StudentDetailsView;
import org.rooinaction.coursemanager.client.managed.ui.StudentEditView;
import org.rooinaction.coursemanager.client.managed.ui.StudentListView;
import org.rooinaction.coursemanager.client.managed.ui.StudentMobileDetailsView;
import org.rooinaction.coursemanager.client.managed.ui.StudentMobileEditView;
import org.rooinaction.coursemanager.client.scaffold.ScaffoldApp;
import org.rooinaction.coursemanager.client.scaffold.place.CreateAndEditProxy;
import org.rooinaction.coursemanager.client.scaffold.place.FindAndEditProxy;
import org.rooinaction.coursemanager.client.scaffold.place.ProxyPlace;
import org.rooinaction.coursemanager.web.gwt.proxies.RegistrationProxy;
import org.rooinaction.coursemanager.web.gwt.proxies.StudentProxy;
import org.rooinaction.coursemanager.web.gwt.requests.StudentRequest;

public abstract class StudentActivitiesMapper_Roo_Gwt {

    protected ApplicationRequestFactory requests;

    protected PlaceController placeController;

    protected Activity makeCreateActivity() {
        StudentEditView.instance().setCreating(true);
        final StudentRequest request = requests.studentRequest();
        Activity activity = new CreateAndEditProxy<StudentProxy>(StudentProxy.class, request, ScaffoldApp.isMobile() ? StudentMobileEditView.instance() : StudentEditView.instance(), placeController) {

            @Override
            protected RequestContext createSaveRequest(StudentProxy proxy) {
                request.persist().using(proxy);
                return request;
            }
        };
        return new StudentEditActivityWrapper(requests, ScaffoldApp.isMobile() ? StudentMobileEditView.instance() : StudentEditView.instance(), activity, null);
    }

    @SuppressWarnings("unchecked")
    protected EntityProxyId<org.rooinaction.coursemanager.web.gwt.proxies.StudentProxy> coerceId(ProxyPlace place) {
        return (EntityProxyId<StudentProxy>) place.getProxyId();
    }

    protected Activity makeEditActivity(ProxyPlace place) {
        StudentEditView.instance().setCreating(false);
        EntityProxyId<StudentProxy> proxyId = coerceId(place);
        Activity activity = new FindAndEditProxy<StudentProxy>(proxyId, requests, ScaffoldApp.isMobile() ? StudentMobileEditView.instance() : StudentEditView.instance(), placeController) {

            @Override
            protected RequestContext createSaveRequest(StudentProxy proxy) {
                StudentRequest request = requests.studentRequest();
                request.persist().using(proxy);
                return request;
            }
        };
        return new StudentEditActivityWrapper(requests, ScaffoldApp.isMobile() ? StudentMobileEditView.instance() : StudentEditView.instance(), activity, proxyId);
    }
}
