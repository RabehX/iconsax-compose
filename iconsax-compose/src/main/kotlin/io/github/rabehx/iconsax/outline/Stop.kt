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

val Iconsax.Outline.Stop: ImageVector
    get() {
        if (_Stop != null) {
            return _Stop!!
        }
        _Stop = ImageVector.Builder(
            name = "Outline.Stop",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.7f, 21.75f)
                horizontalLineTo(9.3f)
                curveTo(4.36f, 21.75f, 2.25f, 19.64f, 2.25f, 14.7f)
                verticalLineTo(9.3f)
                curveTo(2.25f, 4.36f, 4.36f, 2.25f, 9.3f, 2.25f)
                horizontalLineTo(14.7f)
                curveTo(19.64f, 2.25f, 21.75f, 4.36f, 21.75f, 9.3f)
                verticalLineTo(14.7f)
                curveTo(21.75f, 19.64f, 19.64f, 21.75f, 14.7f, 21.75f)
                close()
                moveTo(9.3f, 3.75f)
                curveTo(5.2f, 3.75f, 3.75f, 5.2f, 3.75f, 9.3f)
                verticalLineTo(14.7f)
                curveTo(3.75f, 18.8f, 5.2f, 20.25f, 9.3f, 20.25f)
                horizontalLineTo(14.7f)
                curveTo(18.8f, 20.25f, 20.25f, 18.8f, 20.25f, 14.7f)
                verticalLineTo(9.3f)
                curveTo(20.25f, 5.2f, 18.8f, 3.75f, 14.7f, 3.75f)
                horizontalLineTo(9.3f)
                close()
            }
        }.build()

        return _Stop!!
    }

@Suppress("ObjectPropertyName")
private var _Stop: ImageVector? = null
