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

val Iconsax.Outline.UserTick: ImageVector
    get() {
        if (_UserTick != null) {
            return _UserTick!!
        }
        _UserTick = ImageVector.Builder(
            name = "Outline.UserTick",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 12.75f)
                curveTo(8.83f, 12.75f, 6.25f, 10.17f, 6.25f, 7f)
                curveTo(6.25f, 3.83f, 8.83f, 1.25f, 12f, 1.25f)
                curveTo(15.17f, 1.25f, 17.75f, 3.83f, 17.75f, 7f)
                curveTo(17.75f, 10.17f, 15.17f, 12.75f, 12f, 12.75f)
                close()
                moveTo(12f, 2.75f)
                curveTo(9.66f, 2.75f, 7.75f, 4.66f, 7.75f, 7f)
                curveTo(7.75f, 9.34f, 9.66f, 11.25f, 12f, 11.25f)
                curveTo(14.34f, 11.25f, 16.25f, 9.34f, 16.25f, 7f)
                curveTo(16.25f, 4.66f, 14.34f, 2.75f, 12f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(3.41f, 22.75f)
                curveTo(3f, 22.75f, 2.66f, 22.41f, 2.66f, 22f)
                curveTo(2.66f, 17.73f, 6.85f, 14.25f, 12f, 14.25f)
                curveTo(13.01f, 14.25f, 14f, 14.38f, 14.96f, 14.65f)
                curveTo(15.36f, 14.76f, 15.59f, 15.17f, 15.48f, 15.57f)
                curveTo(15.37f, 15.97f, 14.96f, 16.2f, 14.56f, 16.09f)
                curveTo(13.74f, 15.86f, 12.88f, 15.75f, 12f, 15.75f)
                curveTo(7.68f, 15.75f, 4.16f, 18.55f, 4.16f, 22f)
                curveTo(4.16f, 22.41f, 3.82f, 22.75f, 3.41f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18f, 22.75f)
                curveTo(16.34f, 22.75f, 14.78f, 21.87f, 13.94f, 20.44f)
                curveTo(13.49f, 19.72f, 13.25f, 18.87f, 13.25f, 18f)
                curveTo(13.25f, 16.54f, 13.9f, 15.19f, 15.03f, 14.29f)
                curveTo(15.87f, 13.62f, 16.93f, 13.25f, 18f, 13.25f)
                curveTo(20.62f, 13.25f, 22.75f, 15.38f, 22.75f, 18f)
                curveTo(22.75f, 18.87f, 22.51f, 19.72f, 22.06f, 20.45f)
                curveTo(21.81f, 20.87f, 21.49f, 21.25f, 21.11f, 21.57f)
                curveTo(20.28f, 22.33f, 19.17f, 22.75f, 18f, 22.75f)
                close()
                moveTo(18f, 14.75f)
                curveTo(17.26f, 14.75f, 16.56f, 15f, 15.97f, 15.47f)
                curveTo(15.2f, 16.08f, 14.75f, 17.01f, 14.75f, 18f)
                curveTo(14.75f, 18.59f, 14.91f, 19.17f, 15.22f, 19.67f)
                curveTo(15.8f, 20.65f, 16.87f, 21.25f, 18f, 21.25f)
                curveTo(18.79f, 21.25f, 19.55f, 20.96f, 20.13f, 20.44f)
                curveTo(20.39f, 20.22f, 20.61f, 19.96f, 20.77f, 19.68f)
                curveTo(21.09f, 19.17f, 21.25f, 18.59f, 21.25f, 18f)
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

        return _UserTick!!
    }

@Suppress("ObjectPropertyName")
private var _UserTick: ImageVector? = null
