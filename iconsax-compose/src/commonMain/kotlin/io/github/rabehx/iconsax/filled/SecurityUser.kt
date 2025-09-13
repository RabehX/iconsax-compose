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


val Iconsax.Filled.SecurityUser: ImageVector
    get() {
        if (_SecurityUser != null) {
            return _SecurityUser!!
        }
        _SecurityUser = ImageVector.Builder(
            name = "Filled.SecurityUser",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.5f, 4.11f)
                lineTo(13.51f, 2.24f)
                curveTo(12.68f, 1.93f, 11.32f, 1.93f, 10.49f, 2.24f)
                lineTo(5.5f, 4.11f)
                curveTo(4.35f, 4.54f, 3.41f, 5.9f, 3.41f, 7.12f)
                verticalLineTo(14.55f)
                curveTo(3.41f, 15.73f, 4.19f, 17.28f, 5.14f, 17.99f)
                lineTo(9.44f, 21.2f)
                curveTo(10.85f, 22.26f, 13.17f, 22.26f, 14.58f, 21.2f)
                lineTo(18.88f, 17.99f)
                curveTo(19.83f, 17.28f, 20.61f, 15.73f, 20.61f, 14.55f)
                verticalLineTo(7.12f)
                curveTo(20.59f, 5.9f, 19.65f, 4.54f, 18.5f, 4.11f)
                close()
                moveTo(11.93f, 7.03f)
                curveTo(13.11f, 7.03f, 14.07f, 7.99f, 14.07f, 9.17f)
                curveTo(14.07f, 10.33f, 13.16f, 11.26f, 12.01f, 11.3f)
                horizontalLineTo(11.99f)
                horizontalLineTo(11.97f)
                curveTo(11.95f, 11.3f, 11.93f, 11.3f, 11.91f, 11.3f)
                curveTo(10.71f, 11.26f, 9.81f, 10.33f, 9.81f, 9.17f)
                curveTo(9.8f, 7.99f, 10.76f, 7.03f, 11.93f, 7.03f)
                close()
                moveTo(14.19f, 16.36f)
                curveTo(13.58f, 16.76f, 12.79f, 16.97f, 12f, 16.97f)
                curveTo(11.21f, 16.97f, 10.41f, 16.77f, 9.81f, 16.36f)
                curveTo(9.24f, 15.98f, 8.93f, 15.46f, 8.92f, 14.89f)
                curveTo(8.92f, 14.33f, 9.24f, 13.79f, 9.81f, 13.41f)
                curveTo(11.02f, 12.61f, 12.99f, 12.61f, 14.2f, 13.41f)
                curveTo(14.77f, 13.79f, 15.09f, 14.31f, 15.09f, 14.88f)
                curveTo(15.08f, 15.44f, 14.76f, 15.98f, 14.19f, 16.36f)
                close()
            }
        }.build()

        return _SecurityUser!!
    }

@Suppress("ObjectPropertyName")
private var _SecurityUser: ImageVector? = null
