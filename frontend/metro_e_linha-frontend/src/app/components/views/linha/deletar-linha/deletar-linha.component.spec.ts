import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DeletarLinhaComponent } from './deletar-linha.component';

describe('DeletarLinhaComponent', () => {
  let component: DeletarLinhaComponent;
  let fixture: ComponentFixture<DeletarLinhaComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [DeletarLinhaComponent]
    });
    fixture = TestBed.createComponent(DeletarLinhaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
