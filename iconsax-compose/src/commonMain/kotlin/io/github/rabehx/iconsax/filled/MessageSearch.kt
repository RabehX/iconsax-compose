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


val Iconsax.Filled.MessageSearch: ImageVector
    get() {
        if (_MessageSearch != null) {
            return _MessageSearch!!
        }
        _MessageSearch = ImageVector.Builder(
            name = "Filled.MessageSearch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17f, 2f)
                horizontalLineTo(7f)
                curveTo(4.24f, 2f, 2f, 4.23f, 2f, 6.98f)
                verticalLineTo(12.96f)
                verticalLineTo(13.96f)
                curveTo(2f, 16.71f, 4.24f, 18.94f, 7f, 18.94f)
                horizontalLineTo(8.5f)
                curveTo(8.77f, 18.94f, 9.13f, 19.12f, 9.3f, 19.34f)
                lineTo(10.8f, 21.33f)
                curveTo(11.46f, 22.21f, 12.54f, 22.21f, 13.2f, 21.33f)
                lineTo(14.7f, 19.34f)
                curveTo(14.89f, 19.09f, 15.19f, 18.94f, 15.5f, 18.94f)
                horizontalLineTo(17f)
                curveTo(19.76f, 18.94f, 22f, 16.71f, 22f, 13.96f)
                verticalLineTo(6.98f)
                curveTo(22f, 4.23f, 19.76f, 2f, 17f, 2f)
                close()
                moveTo(15.66f, 14.53f)
                curveTo(15.51f, 14.68f, 15.32f, 14.75f, 15.13f, 14.75f)
                curveTo(14.94f, 14.75f, 14.75f, 14.68f, 14.6f, 14.53f)
                lineTo(13.86f, 13.79f)
                curveTo(13.28f, 14.17f, 12.58f, 14.4f, 11.83f, 14.4f)
                curveTo(9.79f, 14.4f, 8.13f, 12.74f, 8.13f, 10.7f)
                curveTo(8.13f, 8.66f, 9.78f, 7f, 11.83f, 7f)
                curveTo(13.88f, 7f, 15.53f, 8.66f, 15.53f, 10.7f)
                curveTo(15.53f, 11.45f, 15.3f, 12.15f, 14.92f, 12.73f)
                lineTo(15.66f, 13.47f)
                curveTo(15.95f, 13.76f, 15.95f, 14.24f, 15.66f, 14.53f)
                close()
            }
        }.build()

        return _MessageSearch!!
    }

@Suppress("ObjectPropertyName")
private var _MessageSearch: ImageVector? = null
