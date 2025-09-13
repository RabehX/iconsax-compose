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

val Iconsax.Outline.Subtitle: ImageVector
    get() {
        if (_Subtitle != null) {
            return _Subtitle!!
        }
        _Subtitle = ImageVector.Builder(
            name = "Outline.Subtitle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 22.75f)
                horizontalLineTo(9f)
                curveTo(3.57f, 22.75f, 1.25f, 20.43f, 1.25f, 15f)
                verticalLineTo(9f)
                curveTo(1.25f, 3.57f, 3.57f, 1.25f, 9f, 1.25f)
                horizontalLineTo(15f)
                curveTo(20.43f, 1.25f, 22.75f, 3.57f, 22.75f, 9f)
                verticalLineTo(15f)
                curveTo(22.75f, 20.43f, 20.43f, 22.75f, 15f, 22.75f)
                close()
                moveTo(9f, 2.75f)
                curveTo(4.39f, 2.75f, 2.75f, 4.39f, 2.75f, 9f)
                verticalLineTo(15f)
                curveTo(2.75f, 19.61f, 4.39f, 21.25f, 9f, 21.25f)
                horizontalLineTo(15f)
                curveTo(19.61f, 21.25f, 21.25f, 19.61f, 21.25f, 15f)
                verticalLineTo(9f)
                curveTo(21.25f, 4.39f, 19.61f, 2.75f, 15f, 2.75f)
                horizontalLineTo(9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.5f, 17.83f)
                horizontalLineTo(15.65f)
                curveTo(15.24f, 17.83f, 14.9f, 17.49f, 14.9f, 17.08f)
                curveTo(14.9f, 16.67f, 15.24f, 16.33f, 15.65f, 16.33f)
                horizontalLineTo(17.5f)
                curveTo(17.91f, 16.33f, 18.25f, 16.67f, 18.25f, 17.08f)
                curveTo(18.25f, 17.49f, 17.91f, 17.83f, 17.5f, 17.83f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.97f, 17.83f)
                horizontalLineTo(6.5f)
                curveTo(6.09f, 17.83f, 5.75f, 17.49f, 5.75f, 17.08f)
                curveTo(5.75f, 16.67f, 6.09f, 16.33f, 6.5f, 16.33f)
                horizontalLineTo(12.97f)
                curveTo(13.38f, 16.33f, 13.72f, 16.67f, 13.72f, 17.08f)
                curveTo(13.72f, 17.49f, 13.39f, 17.83f, 12.97f, 17.83f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.501f, 14.07f)
                horizontalLineTo(11.971f)
                curveTo(11.561f, 14.07f, 11.221f, 13.73f, 11.221f, 13.32f)
                curveTo(11.221f, 12.91f, 11.561f, 12.57f, 11.971f, 12.57f)
                horizontalLineTo(17.501f)
                curveTo(17.911f, 12.57f, 18.251f, 12.91f, 18.251f, 13.32f)
                curveTo(18.251f, 13.73f, 17.911f, 14.07f, 17.501f, 14.07f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.27f, 14.07f)
                horizontalLineTo(6.5f)
                curveTo(6.09f, 14.07f, 5.75f, 13.73f, 5.75f, 13.32f)
                curveTo(5.75f, 12.91f, 6.09f, 12.57f, 6.5f, 12.57f)
                horizontalLineTo(9.27f)
                curveTo(9.68f, 12.57f, 10.02f, 12.91f, 10.02f, 13.32f)
                curveTo(10.02f, 13.73f, 9.68f, 14.07f, 9.27f, 14.07f)
                close()
            }
        }.build()

        return _Subtitle!!
    }

@Suppress("ObjectPropertyName")
private var _Subtitle: ImageVector? = null
