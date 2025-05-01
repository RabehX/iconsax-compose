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


val Iconsax.Filled.FilterSearch: ImageVector
    get() {
        if (_FilterSearch != null) {
            return _FilterSearch!!
        }
        _FilterSearch = ImageVector.Builder(
            name = "Filled.FilterSearch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.721f, 18.24f)
                lineTo(19.781f, 17.3f)
                curveTo(20.271f, 16.56f, 20.561f, 15.67f, 20.561f, 14.71f)
                curveTo(20.561f, 12.11f, 18.451f, 10f, 15.851f, 10f)
                curveTo(13.251f, 10f, 11.141f, 12.11f, 11.141f, 14.71f)
                curveTo(11.141f, 17.31f, 13.251f, 19.42f, 15.851f, 19.42f)
                curveTo(16.811f, 19.42f, 17.691f, 19.13f, 18.441f, 18.64f)
                lineTo(19.381f, 19.58f)
                curveTo(19.571f, 19.77f, 19.811f, 19.86f, 20.061f, 19.86f)
                curveTo(20.311f, 19.86f, 20.551f, 19.77f, 20.741f, 19.58f)
                curveTo(21.091f, 19.22f, 21.091f, 18.62f, 20.721f, 18.24f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.58f, 4.02f)
                verticalLineTo(6.24f)
                curveTo(19.58f, 7.05f, 19.08f, 8.06f, 18.58f, 8.57f)
                lineTo(18.4f, 8.73f)
                curveTo(18.26f, 8.86f, 18.05f, 8.89f, 17.87f, 8.83f)
                curveTo(17.67f, 8.76f, 17.47f, 8.71f, 17.27f, 8.66f)
                curveTo(16.83f, 8.55f, 16.36f, 8.5f, 15.88f, 8.5f)
                curveTo(12.43f, 8.5f, 9.63f, 11.3f, 9.63f, 14.75f)
                curveTo(9.63f, 15.89f, 9.94f, 17.01f, 10.53f, 17.97f)
                curveTo(11.03f, 18.81f, 11.73f, 19.51f, 12.49f, 19.98f)
                curveTo(12.72f, 20.13f, 12.81f, 20.45f, 12.61f, 20.63f)
                curveTo(12.54f, 20.69f, 12.47f, 20.74f, 12.4f, 20.79f)
                lineTo(11f, 21.7f)
                curveTo(9.7f, 22.51f, 7.91f, 21.6f, 7.91f, 19.98f)
                verticalLineTo(14.63f)
                curveTo(7.91f, 13.92f, 7.51f, 13.01f, 7.11f, 12.51f)
                lineTo(3.32f, 8.47f)
                curveTo(2.82f, 7.96f, 2.42f, 7.05f, 2.42f, 6.45f)
                verticalLineTo(4.12f)
                curveTo(2.42f, 2.91f, 3.32f, 2f, 4.41f, 2f)
                horizontalLineTo(17.59f)
                curveTo(18.68f, 2f, 19.58f, 2.91f, 19.58f, 4.02f)
                close()
            }
        }.build()

        return _FilterSearch!!
    }

@Suppress("ObjectPropertyName")
private var _FilterSearch: ImageVector? = null
