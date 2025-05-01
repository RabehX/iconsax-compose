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

val Iconsax.Outline.SecurityTime: ImageVector
    get() {
        if (_SecurityTime != null) {
            return _SecurityTime!!
        }
        _SecurityTime = ImageVector.Builder(
            name = "Outline.SecurityTime",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 22.76f)
                curveTo(10.91f, 22.76f, 9.83f, 22.44f, 8.98f, 21.81f)
                lineTo(4.68f, 18.6f)
                curveTo(3.54f, 17.75f, 2.65f, 15.97f, 2.65f, 14.56f)
                verticalLineTo(7.12f)
                curveTo(2.65f, 5.58f, 3.78f, 3.94f, 5.23f, 3.4f)
                lineTo(10.22f, 1.53f)
                curveTo(11.21f, 1.16f, 12.77f, 1.16f, 13.76f, 1.53f)
                lineTo(18.75f, 3.4f)
                curveTo(20.2f, 3.94f, 21.33f, 5.58f, 21.33f, 7.12f)
                verticalLineTo(14.55f)
                curveTo(21.33f, 15.97f, 20.44f, 17.74f, 19.3f, 18.59f)
                lineTo(15f, 21.8f)
                curveTo(14.17f, 22.44f, 13.09f, 22.76f, 12f, 22.76f)
                close()
                moveTo(10.75f, 2.94f)
                lineTo(5.76f, 4.81f)
                curveTo(4.91f, 5.13f, 4.16f, 6.21f, 4.16f, 7.13f)
                verticalLineTo(14.56f)
                curveTo(4.16f, 15.51f, 4.83f, 16.84f, 5.58f, 17.4f)
                lineTo(9.88f, 20.61f)
                curveTo(11.03f, 21.47f, 12.97f, 21.47f, 14.13f, 20.61f)
                lineTo(18.43f, 17.4f)
                curveTo(19.19f, 16.83f, 19.85f, 15.51f, 19.85f, 14.56f)
                verticalLineTo(7.12f)
                curveTo(19.85f, 6.21f, 19.1f, 5.13f, 18.25f, 4.8f)
                lineTo(13.26f, 2.93f)
                curveTo(12.58f, 2.69f, 11.42f, 2.69f, 10.75f, 2.94f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 16.25f)
                curveTo(9.38f, 16.25f, 7.25f, 14.12f, 7.25f, 11.5f)
                curveTo(7.25f, 8.88f, 9.38f, 6.75f, 12f, 6.75f)
                curveTo(14.62f, 6.75f, 16.75f, 8.88f, 16.75f, 11.5f)
                curveTo(16.75f, 14.12f, 14.62f, 16.25f, 12f, 16.25f)
                close()
                moveTo(12f, 8.25f)
                curveTo(10.21f, 8.25f, 8.75f, 9.71f, 8.75f, 11.5f)
                curveTo(8.75f, 13.29f, 10.21f, 14.75f, 12f, 14.75f)
                curveTo(13.79f, 14.75f, 15.25f, 13.29f, 15.25f, 11.5f)
                curveTo(15.25f, 9.71f, 13.79f, 8.25f, 12f, 8.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11f, 13.25f)
                curveTo(10.75f, 13.25f, 10.5f, 13.12f, 10.36f, 12.89f)
                curveTo(10.15f, 12.53f, 10.26f, 12.07f, 10.62f, 11.86f)
                lineTo(11.38f, 11.4f)
                curveTo(11.46f, 11.35f, 11.5f, 11.27f, 11.5f, 11.19f)
                verticalLineTo(10.26f)
                curveTo(11.5f, 9.85f, 11.84f, 9.51f, 12.25f, 9.51f)
                curveTo(12.66f, 9.51f, 13f, 9.84f, 13f, 10.25f)
                verticalLineTo(11.18f)
                curveTo(13f, 11.79f, 12.67f, 12.37f, 12.15f, 12.68f)
                lineTo(11.38f, 13.14f)
                curveTo(11.27f, 13.22f, 11.13f, 13.25f, 11f, 13.25f)
                close()
            }
        }.build()

        return _SecurityTime!!
    }

@Suppress("ObjectPropertyName")
private var _SecurityTime: ImageVector? = null
