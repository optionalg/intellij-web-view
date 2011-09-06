package web.view.ukhorskaya.sessions;

import com.intellij.openapi.editor.impl.IterationState;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiFile;
import web.view.ukhorskaya.providers.BaseHighlighterProvider;

/**
 * Created by IntelliJ IDEA.
 * User: Natalia.Ukhorskaya
 * Date: 9/6/11
 * Time: 12:30 PM
 */

public class TestHttpSession extends HttpSession {
    private BaseHighlighterProvider hProvider;

        public void setIterationState(IterationState state) {
            this.iterationState = state;
        }

        public void setHighlightingProvider(BaseHighlighterProvider provider) {
            this.hProvider = provider;
        }

        public void setIntPosition(int position) {
            this.intPositionState = position;
        }

        public void setPsiFile(PsiFile file) {
            this.psiFile = file;
        }

        @Override
        protected BaseHighlighterProvider getProvider() {
            return hProvider;
        }

        @Override
        public void setVariables(VirtualFile file) {
        }

}
