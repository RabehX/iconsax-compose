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


val Iconsax.Filled.Instagram: ImageVector
    get() {
        if (_Instagram != null) {
            return _Instagram!!
        }
        _Instagram = ImageVector.Builder(
            name = "Filled.Instagram",
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
                moveTo(12f, 15.88f)
                curveTo(9.86f, 15.88f, 8.12f, 14.14f, 8.12f, 12f)
                curveTo(8.12f, 9.86f, 9.86f, 8.12f, 12f, 8.12f)
                curveTo(14.14f, 8.12f, 15.88f, 9.86f, 15.88f, 12f)
                curveTo(15.88f, 14.14f, 14.14f, 15.88f, 12f, 15.88f)
                close()
                moveTo(17.92f, 6.88f)
                curveTo(17.87f, 7f, 17.8f, 7.11f, 17.71f, 7.21f)
                curveTo(17.61f, 7.3f, 17.5f, 7.37f, 17.38f, 7.42f)
                curveTo(17.26f, 7.47f, 17.13f, 7.5f, 17f, 7.5f)
                curveTo(16.73f, 7.5f, 16.48f, 7.4f, 16.29f, 7.21f)
                curveTo(16.2f, 7.11f, 16.13f, 7f, 16.08f, 6.88f)
                curveTo(16.03f, 6.76f, 16f, 6.63f, 16f, 6.5f)
                curveTo(16f, 6.37f, 16.03f, 6.24f, 16.08f, 6.12f)
                curveTo(16.13f, 5.99f, 16.2f, 5.89f, 16.29f, 5.79f)
                curveTo(16.52f, 5.56f, 16.87f, 5.45f, 17.19f, 5.52f)
                curveTo(17.26f, 5.53f, 17.32f, 5.55f, 17.38f, 5.58f)
                curveTo(17.44f, 5.6f, 17.5f, 5.63f, 17.56f, 5.67f)
                curveTo(17.61f, 5.7f, 17.66f, 5.75f, 17.71f, 5.79f)
                curveTo(17.8f, 5.89f, 17.87f, 5.99f, 17.92f, 6.12f)
                curveTo(17.97f, 6.24f, 18f, 6.37f, 18f, 6.5f)
                curveTo(18f, 6.63f, 17.97f, 6.76f, 17.92f, 6.88f)
                close()
            }
        }.build()

        return _Instagram!!
    }

@Suppress("ObjectPropertyName")
private var _Instagram: ImageVector? = null
