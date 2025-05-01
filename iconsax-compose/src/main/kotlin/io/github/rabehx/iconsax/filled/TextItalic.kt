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


val Iconsax.Filled.TextItalic: ImageVector
    get() {
        if (_TextItalic != null) {
            return _TextItalic!!
        }
        _TextItalic = ImageVector.Builder(
            name = "Filled.TextItalic",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.95f, 4.13f)
                curveTo(20.66f, 3.71f, 20.29f, 3.34f, 19.87f, 3.05f)
                curveTo(18.92f, 2.36f, 17.68f, 2f, 16.19f, 2f)
                horizontalLineTo(7.81f)
                curveTo(7.61f, 2f, 7.41f, 2.01f, 7.22f, 2.03f)
                curveTo(3.94f, 2.24f, 2f, 4.37f, 2f, 7.81f)
                verticalLineTo(16.19f)
                curveTo(2f, 17.68f, 2.36f, 18.92f, 3.05f, 19.87f)
                curveTo(3.34f, 20.29f, 3.71f, 20.66f, 4.13f, 20.95f)
                curveTo(4.95f, 21.55f, 5.99f, 21.9f, 7.22f, 21.98f)
                curveTo(7.41f, 21.99f, 7.61f, 22f, 7.81f, 22f)
                horizontalLineTo(16.19f)
                curveTo(19.83f, 22f, 22f, 19.83f, 22f, 16.19f)
                verticalLineTo(7.81f)
                curveTo(22f, 6.32f, 21.64f, 5.08f, 20.95f, 4.13f)
                close()
                moveTo(15.87f, 7.51f)
                horizontalLineTo(13.92f)
                lineTo(11.68f, 16.48f)
                horizontalLineTo(13.52f)
                curveTo(13.93f, 16.48f, 14.27f, 16.82f, 14.27f, 17.23f)
                curveTo(14.27f, 17.64f, 13.93f, 17.98f, 13.52f, 17.98f)
                horizontalLineTo(8.13f)
                curveTo(7.72f, 17.98f, 7.38f, 17.64f, 7.38f, 17.23f)
                curveTo(7.38f, 16.82f, 7.72f, 16.48f, 8.13f, 16.48f)
                horizontalLineTo(10.13f)
                lineTo(12.37f, 7.51f)
                horizontalLineTo(10.48f)
                curveTo(10.07f, 7.51f, 9.73f, 7.17f, 9.73f, 6.76f)
                curveTo(9.73f, 6.35f, 10.07f, 6.01f, 10.48f, 6.01f)
                horizontalLineTo(15.86f)
                curveTo(16.27f, 6.01f, 16.61f, 6.35f, 16.61f, 6.76f)
                curveTo(16.61f, 7.17f, 16.28f, 7.51f, 15.87f, 7.51f)
                close()
            }
        }.build()

        return _TextItalic!!
    }

@Suppress("ObjectPropertyName")
private var _TextItalic: ImageVector? = null
