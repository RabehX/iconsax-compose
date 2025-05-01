/*
 *
 *  * Copyright (c) 2025, Рабeх Аззам
 *  *
 *  * This file is part of Iconsax Compose.
 *  *
 *  * Iconsax Compose is free software: you can redistribute it and/or modify
 *  * it under the terms of the GNU General Public License as published by
 *  * the Free Software Foundation, either version 3 of the License, or
 *  * (at your option) any later version.
 *  *
 *  * Iconsax Compose is distributed in the hope that it will be useful,
 *  * but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *  * GNU General Public License for more details.
 *  *
 *  * You should have received a copy of the GNU General Public License
 *  * along with Iconsax Compose. If not, see <https://www.gnu.org/licenses/>.
 *
 */

package io.github.rabehx.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax

val Iconsax.Outline.Redo: ImageVector
    get() {
        if (_Redo != null) {
            return _Redo!!
        }
        _Redo = ImageVector.Builder(
            name = "Outline.Redo",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.869f, 19.06f)
                horizontalLineTo(8.869f)
                curveTo(5.699f, 19.06f, 3.119f, 16.48f, 3.119f, 13.31f)
                curveTo(3.119f, 10.14f, 5.699f, 7.56f, 8.869f, 7.56f)
                horizontalLineTo(19.869f)
                curveTo(20.279f, 7.56f, 20.619f, 7.9f, 20.619f, 8.31f)
                curveTo(20.619f, 8.72f, 20.279f, 9.06f, 19.869f, 9.06f)
                horizontalLineTo(8.869f)
                curveTo(6.529f, 9.06f, 4.619f, 10.97f, 4.619f, 13.31f)
                curveTo(4.619f, 15.65f, 6.529f, 17.56f, 8.869f, 17.56f)
                horizontalLineTo(16.869f)
                curveTo(17.279f, 17.56f, 17.619f, 17.9f, 17.619f, 18.31f)
                curveTo(17.619f, 18.72f, 17.289f, 19.06f, 16.869f, 19.06f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.57f, 11.56f)
                curveTo(17.38f, 11.56f, 17.19f, 11.49f, 17.04f, 11.34f)
                curveTo(16.75f, 11.05f, 16.75f, 10.57f, 17.04f, 10.28f)
                lineTo(19.07f, 8.25f)
                lineTo(17.04f, 6.22f)
                curveTo(16.75f, 5.93f, 16.75f, 5.45f, 17.04f, 5.16f)
                curveTo(17.33f, 4.87f, 17.81f, 4.87f, 18.1f, 5.16f)
                lineTo(20.66f, 7.72f)
                curveTo(20.95f, 8.01f, 20.95f, 8.49f, 20.66f, 8.78f)
                lineTo(18.1f, 11.34f)
                curveTo(17.95f, 11.49f, 17.76f, 11.56f, 17.57f, 11.56f)
                close()
            }
        }.build()

        return _Redo!!
    }

@Suppress("ObjectPropertyName")
private var _Redo: ImageVector? = null
