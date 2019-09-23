package academy.devdojo.service;

import academy.devdojo.domain.OriginalCode;
import academy.devdojo.dto.ResponseBodyDto;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;

@RequestScoped
@Slf4j
public class OriginalCodeService {

    private static final String SELECT_ALL = "SELECT o FROM OriginalCode o";
    private static final int MAX_RESULTS = 25;
    @Inject
    EntityManager em;

    public ResponseBodyDto<OriginalCode> list() {
        TypedQuery<OriginalCode> originalCode = em.createQuery(SELECT_ALL, OriginalCode.class);

        originalCode.setMaxResults(MAX_RESULTS);

        return new ResponseBodyDto<>(originalCode.getResultList());
    }

    @Transactional
    public Long save(OriginalCode originalCode) {
        originalCode.setId(null);
        em.persist(originalCode);
        em.flush();
        return originalCode.getId();
    }
}
