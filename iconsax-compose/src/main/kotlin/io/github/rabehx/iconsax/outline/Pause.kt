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

val Iconsax.Outline.Pause: ImageVector
    get() {
        if (_Pause != null) {
            return _Pause!!
        }
        _Pause = ImageVector.Builder(
            name = "Outline.Pause",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.64f, 21.75f)
                horizontalLineTo(5.01f)
                curveTo(3.15f, 21.75f, 2.25f, 20.89f, 2.25f, 19.11f)
                verticalLineTo(4.89f)
                curveTo(2.25f, 3.11f, 3.15f, 2.25f, 5.01f, 2.25f)
                horizontalLineTo(8.64f)
                curveTo(10.5f, 2.25f, 11.4f, 3.11f, 11.4f, 4.89f)
                verticalLineTo(19.11f)
                curveTo(11.4f, 20.89f, 10.5f, 21.75f, 8.64f, 21.75f)
                close()
                moveTo(5.01f, 3.75f)
                curveTo(3.93f, 3.75f, 3.75f, 4.02f, 3.75f, 4.89f)
                verticalLineTo(19.11f)
                curveTo(3.75f, 19.98f, 3.92f, 20.25f, 5.01f, 20.25f)
                horizontalLineTo(8.64f)
                curveTo(9.72f, 20.25f, 9.9f, 19.98f, 9.9f, 19.11f)
                verticalLineTo(4.89f)
                curveTo(9.9f, 4.02f, 9.73f, 3.75f, 8.64f, 3.75f)
                horizontalLineTo(5.01f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.99f, 21.75f)
                horizontalLineTo(15.36f)
                curveTo(13.5f, 21.75f, 12.6f, 20.89f, 12.6f, 19.11f)
                verticalLineTo(4.89f)
                curveTo(12.6f, 3.11f, 13.5f, 2.25f, 15.36f, 2.25f)
                horizontalLineTo(18.99f)
                curveTo(20.85f, 2.25f, 21.75f, 3.11f, 21.75f, 4.89f)
                verticalLineTo(19.11f)
                curveTo(21.75f, 20.89f, 20.85f, 21.75f, 18.99f, 21.75f)
                close()
                moveTo(15.36f, 3.75f)
                curveTo(14.28f, 3.75f, 14.1f, 4.02f, 14.1f, 4.89f)
                verticalLineTo(19.11f)
                curveTo(14.1f, 19.98f, 14.27f, 20.25f, 15.36f, 20.25f)
                horizontalLineTo(18.99f)
                curveTo(20.07f, 20.25f, 20.25f, 19.98f, 20.25f, 19.11f)
                verticalLineTo(4.89f)
                curveTo(20.25f, 4.02f, 20.08f, 3.75f, 18.99f, 3.75f)
                horizontalLineTo(15.36f)
                close()
            }
        }.build()

        return _Pause!!
    }

@Suppress("ObjectPropertyName")
private var _Pause: ImageVector? = null
