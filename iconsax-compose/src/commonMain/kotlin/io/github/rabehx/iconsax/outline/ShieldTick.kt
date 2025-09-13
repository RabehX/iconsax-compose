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

val Iconsax.Outline.ShieldTick: ImageVector
    get() {
        if (_ShieldTick != null) {
            return _ShieldTick!!
        }
        _ShieldTick = ImageVector.Builder(
            name = "Outline.ShieldTick",
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
                moveTo(10.66f, 14.23f)
                curveTo(10.47f, 14.23f, 10.28f, 14.16f, 10.13f, 14.01f)
                lineTo(8.52f, 12.4f)
                curveTo(8.23f, 12.11f, 8.23f, 11.63f, 8.52f, 11.34f)
                curveTo(8.81f, 11.05f, 9.29f, 11.05f, 9.58f, 11.34f)
                lineTo(10.66f, 12.42f)
                lineTo(14.43f, 8.65f)
                curveTo(14.72f, 8.36f, 15.2f, 8.36f, 15.49f, 8.65f)
                curveTo(15.78f, 8.94f, 15.78f, 9.42f, 15.49f, 9.71f)
                lineTo(11.19f, 14.01f)
                curveTo(11.04f, 14.16f, 10.85f, 14.23f, 10.66f, 14.23f)
                close()
            }
        }.build()

        return _ShieldTick!!
    }

@Suppress("ObjectPropertyName")
private var _ShieldTick: ImageVector? = null
