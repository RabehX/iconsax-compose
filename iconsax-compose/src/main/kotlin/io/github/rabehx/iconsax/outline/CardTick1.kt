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

val Iconsax.Outline.CardTick1: ImageVector
    get() {
        if (_CardTick1 != null) {
            return _CardTick1!!
        }
        _CardTick1 = ImageVector.Builder(
            name = "Outline.CardTick1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 10.75f)
                horizontalLineTo(2f)
                curveTo(1.59f, 10.75f, 1.25f, 10.41f, 1.25f, 10f)
                curveTo(1.25f, 9.59f, 1.59f, 9.25f, 2f, 9.25f)
                horizontalLineTo(22f)
                curveTo(22.41f, 9.25f, 22.75f, 9.59f, 22.75f, 10f)
                curveTo(22.75f, 10.41f, 22.41f, 10.75f, 22f, 10.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.55f, 21.25f)
                horizontalLineTo(6.44f)
                curveTo(2.46f, 21.25f, 1.24f, 20.05f, 1.24f, 16.11f)
                verticalLineTo(7.89f)
                curveTo(1.24f, 4.74f, 1.91f, 2.99f, 5.48f, 2.78f)
                curveTo(5.78f, 2.77f, 6.1f, 2.76f, 6.44f, 2.76f)
                horizontalLineTo(17.55f)
                curveTo(21.53f, 2.76f, 22.75f, 3.96f, 22.75f, 7.9f)
                verticalLineTo(12.31f)
                curveTo(22.75f, 12.72f, 22.41f, 13.06f, 22f, 13.06f)
                curveTo(21.59f, 13.06f, 21.25f, 12.72f, 21.25f, 12.31f)
                verticalLineTo(7.9f)
                curveTo(21.25f, 4.81f, 20.7f, 4.26f, 17.55f, 4.26f)
                horizontalLineTo(6.44f)
                curveTo(6.12f, 4.26f, 5.83f, 4.27f, 5.55f, 4.28f)
                curveTo(3.38f, 4.41f, 2.74f, 4.9f, 2.74f, 7.9f)
                verticalLineTo(16.12f)
                curveTo(2.74f, 19.21f, 3.29f, 19.76f, 6.44f, 19.76f)
                horizontalLineTo(11.55f)
                curveTo(11.96f, 19.76f, 12.3f, 20.1f, 12.3f, 20.51f)
                curveTo(12.3f, 20.92f, 11.97f, 21.25f, 11.55f, 21.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10f, 16.75f)
                horizontalLineTo(6f)
                curveTo(5.59f, 16.75f, 5.25f, 16.41f, 5.25f, 16f)
                curveTo(5.25f, 15.59f, 5.59f, 15.25f, 6f, 15.25f)
                horizontalLineTo(10f)
                curveTo(10.41f, 15.25f, 10.75f, 15.59f, 10.75f, 16f)
                curveTo(10.75f, 16.41f, 10.41f, 16.75f, 10f, 16.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18f, 22.75f)
                curveTo(16.34f, 22.75f, 14.78f, 21.87f, 13.94f, 20.44f)
                curveTo(13.49f, 19.72f, 13.25f, 18.87f, 13.25f, 18f)
                curveTo(13.25f, 15.38f, 15.38f, 13.25f, 18f, 13.25f)
                curveTo(20.62f, 13.25f, 22.75f, 15.38f, 22.75f, 18f)
                curveTo(22.75f, 18.87f, 22.51f, 19.72f, 22.06f, 20.45f)
                curveTo(21.22f, 21.87f, 19.66f, 22.75f, 18f, 22.75f)
                close()
                moveTo(18f, 14.75f)
                curveTo(16.21f, 14.75f, 14.75f, 16.21f, 14.75f, 18f)
                curveTo(14.75f, 18.59f, 14.91f, 19.17f, 15.22f, 19.67f)
                curveTo(15.8f, 20.65f, 16.87f, 21.25f, 18f, 21.25f)
                curveTo(19.13f, 21.25f, 20.2f, 20.65f, 20.78f, 19.68f)
                curveTo(21.09f, 19.17f, 21.25f, 18.6f, 21.25f, 18f)
                curveTo(21.25f, 16.21f, 19.79f, 14.75f, 18f, 14.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.429f, 19.74f)
                curveTo(17.239f, 19.74f, 17.049f, 19.67f, 16.899f, 19.52f)
                lineTo(15.909f, 18.53f)
                curveTo(15.619f, 18.24f, 15.619f, 17.76f, 15.909f, 17.47f)
                curveTo(16.199f, 17.18f, 16.679f, 17.18f, 16.969f, 17.47f)
                lineTo(17.449f, 17.95f)
                lineTo(19.049f, 16.47f)
                curveTo(19.349f, 16.19f, 19.829f, 16.21f, 20.109f, 16.51f)
                curveTo(20.389f, 16.81f, 20.369f, 17.29f, 20.069f, 17.57f)
                lineTo(17.939f, 19.54f)
                curveTo(17.789f, 19.67f, 17.609f, 19.74f, 17.429f, 19.74f)
                close()
            }
        }.build()

        return _CardTick1!!
    }

@Suppress("ObjectPropertyName")
private var _CardTick1: ImageVector? = null
