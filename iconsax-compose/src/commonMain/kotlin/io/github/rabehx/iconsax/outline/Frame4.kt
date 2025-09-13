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

val Iconsax.Outline.Frame4: ImageVector
    get() {
        if (_Frame4 != null) {
            return _Frame4!!
        }
        _Frame4 = ImageVector.Builder(
            name = "Outline.Frame4",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 22.76f)
                curveTo(10.91f, 22.76f, 9.83f, 22.44f, 8.98f, 21.81f)
                lineTo(4.68f, 18.6f)
                curveTo(3.54f, 17.75f, 2.65f, 15.98f, 2.65f, 14.56f)
                verticalLineTo(7.12f)
                curveTo(2.65f, 5.58f, 3.78f, 3.94f, 5.23f, 3.4f)
                lineTo(10.22f, 1.53f)
                curveTo(11.21f, 1.16f, 12.77f, 1.16f, 13.76f, 1.53f)
                lineTo(18.76f, 3.4f)
                curveTo(20.21f, 3.94f, 21.34f, 5.58f, 21.34f, 7.12f)
                verticalLineTo(14.55f)
                curveTo(21.34f, 15.97f, 20.45f, 17.74f, 19.31f, 18.59f)
                lineTo(15.01f, 21.8f)
                curveTo(14.17f, 22.44f, 13.09f, 22.76f, 12f, 22.76f)
                close()
                moveTo(10.75f, 2.94f)
                lineTo(5.76f, 4.81f)
                curveTo(4.9f, 5.13f, 4.15f, 6.21f, 4.15f, 7.13f)
                verticalLineTo(14.56f)
                curveTo(4.15f, 15.51f, 4.82f, 16.84f, 5.57f, 17.4f)
                lineTo(9.87f, 20.61f)
                curveTo(11.02f, 21.47f, 12.97f, 21.47f, 14.12f, 20.61f)
                lineTo(18.42f, 17.4f)
                curveTo(19.18f, 16.83f, 19.84f, 15.5f, 19.84f, 14.56f)
                verticalLineTo(7.12f)
                curveTo(19.84f, 6.21f, 19.09f, 5.13f, 18.23f, 4.8f)
                lineTo(13.24f, 2.93f)
                curveTo(12.58f, 2.69f, 11.42f, 2.69f, 10.75f, 2.94f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 13.25f)
                curveTo(10.48f, 13.25f, 9.25f, 12.02f, 9.25f, 10.5f)
                curveTo(9.25f, 8.98f, 10.48f, 7.75f, 12f, 7.75f)
                curveTo(13.52f, 7.75f, 14.75f, 8.98f, 14.75f, 10.5f)
                curveTo(14.75f, 12.02f, 13.52f, 13.25f, 12f, 13.25f)
                close()
                moveTo(12f, 9.25f)
                curveTo(11.31f, 9.25f, 10.75f, 9.81f, 10.75f, 10.5f)
                curveTo(10.75f, 11.19f, 11.31f, 11.75f, 12f, 11.75f)
                curveTo(12.69f, 11.75f, 13.25f, 11.19f, 13.25f, 10.5f)
                curveTo(13.25f, 9.81f, 12.69f, 9.25f, 12f, 9.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 16.25f)
                curveTo(11.59f, 16.25f, 11.25f, 15.91f, 11.25f, 15.5f)
                verticalLineTo(12.5f)
                curveTo(11.25f, 12.09f, 11.59f, 11.75f, 12f, 11.75f)
                curveTo(12.41f, 11.75f, 12.75f, 12.09f, 12.75f, 12.5f)
                verticalLineTo(15.5f)
                curveTo(12.75f, 15.91f, 12.41f, 16.25f, 12f, 16.25f)
                close()
            }
        }.build()

        return _Frame4!!
    }

@Suppress("ObjectPropertyName")
private var _Frame4: ImageVector? = null
