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


val Iconsax.Filled.Maximize3: ImageVector
    get() {
        if (_Maximize3 != null) {
            return _Maximize3!!
        }
        _Maximize3 = ImageVector.Builder(
            name = "Filled.Maximize3",
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
                moveTo(18.75f, 10f)
                curveTo(18.75f, 10.41f, 18.41f, 10.75f, 18f, 10.75f)
                curveTo(17.59f, 10.75f, 17.25f, 10.41f, 17.25f, 10f)
                verticalLineTo(7.81f)
                lineTo(7.81f, 17.25f)
                horizontalLineTo(10f)
                curveTo(10.41f, 17.25f, 10.75f, 17.59f, 10.75f, 18f)
                curveTo(10.75f, 18.41f, 10.41f, 18.75f, 10f, 18.75f)
                horizontalLineTo(6f)
                curveTo(5.9f, 18.75f, 5.8f, 18.73f, 5.71f, 18.69f)
                curveTo(5.53f, 18.61f, 5.38f, 18.47f, 5.3f, 18.28f)
                curveTo(5.27f, 18.19f, 5.25f, 18.1f, 5.25f, 18f)
                verticalLineTo(14f)
                curveTo(5.25f, 13.59f, 5.59f, 13.25f, 6f, 13.25f)
                curveTo(6.41f, 13.25f, 6.75f, 13.59f, 6.75f, 14f)
                verticalLineTo(16.19f)
                lineTo(16.19f, 6.75f)
                horizontalLineTo(14f)
                curveTo(13.59f, 6.75f, 13.25f, 6.41f, 13.25f, 6f)
                curveTo(13.25f, 5.59f, 13.59f, 5.25f, 14f, 5.25f)
                horizontalLineTo(18f)
                curveTo(18.1f, 5.25f, 18.19f, 5.27f, 18.29f, 5.31f)
                curveTo(18.47f, 5.39f, 18.62f, 5.53f, 18.7f, 5.72f)
                curveTo(18.73f, 5.81f, 18.75f, 5.9f, 18.75f, 6f)
                verticalLineTo(10f)
                close()
            }
        }.build()

        return _Maximize3!!
    }

@Suppress("ObjectPropertyName")
private var _Maximize3: ImageVector? = null
