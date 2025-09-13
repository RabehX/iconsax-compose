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

package io.github.rabehx.iconsax.filled


import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax


val Iconsax.Filled.Subtitle: ImageVector
    get() {
        if (_Subtitle != null) {
            return _Subtitle!!
        }
        _Subtitle = ImageVector.Builder(
            name = "Filled.Subtitle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.19f, 2f)
                horizontalLineTo(7.81f)
                curveTo(4.17f, 2f, 2f, 4.17f, 2f, 7.81f)
                verticalLineTo(16.18f)
                curveTo(2f, 19.83f, 4.17f, 22f, 7.81f, 22f)
                horizontalLineTo(16.18f)
                curveTo(19.82f, 22f, 21.99f, 19.83f, 21.99f, 16.19f)
                verticalLineTo(7.81f)
                curveTo(22f, 4.17f, 19.83f, 2f, 16.19f, 2f)
                close()
                moveTo(6.5f, 12.57f)
                horizontalLineTo(9.27f)
                curveTo(9.68f, 12.57f, 10.02f, 12.91f, 10.02f, 13.32f)
                curveTo(10.02f, 13.73f, 9.68f, 14.07f, 9.27f, 14.07f)
                horizontalLineTo(6.5f)
                curveTo(6.09f, 14.07f, 5.75f, 13.73f, 5.75f, 13.32f)
                curveTo(5.75f, 12.91f, 6.09f, 12.57f, 6.5f, 12.57f)
                close()
                moveTo(12.97f, 17.83f)
                horizontalLineTo(6.5f)
                curveTo(6.09f, 17.83f, 5.75f, 17.49f, 5.75f, 17.08f)
                curveTo(5.75f, 16.67f, 6.09f, 16.33f, 6.5f, 16.33f)
                horizontalLineTo(12.97f)
                curveTo(13.38f, 16.33f, 13.72f, 16.67f, 13.72f, 17.08f)
                curveTo(13.72f, 17.49f, 13.39f, 17.83f, 12.97f, 17.83f)
                close()
                moveTo(17.5f, 17.83f)
                horizontalLineTo(15.65f)
                curveTo(15.24f, 17.83f, 14.9f, 17.49f, 14.9f, 17.08f)
                curveTo(14.9f, 16.67f, 15.24f, 16.33f, 15.65f, 16.33f)
                horizontalLineTo(17.5f)
                curveTo(17.91f, 16.33f, 18.25f, 16.67f, 18.25f, 17.08f)
                curveTo(18.25f, 17.49f, 17.91f, 17.83f, 17.5f, 17.83f)
                close()
                moveTo(17.5f, 14.07f)
                horizontalLineTo(11.97f)
                curveTo(11.56f, 14.07f, 11.22f, 13.73f, 11.22f, 13.32f)
                curveTo(11.22f, 12.91f, 11.56f, 12.57f, 11.97f, 12.57f)
                horizontalLineTo(17.5f)
                curveTo(17.91f, 12.57f, 18.25f, 12.91f, 18.25f, 13.32f)
                curveTo(18.25f, 13.73f, 17.91f, 14.07f, 17.5f, 14.07f)
                close()
            }
        }.build()

        return _Subtitle!!
    }

@Suppress("ObjectPropertyName")
private var _Subtitle: ImageVector? = null
