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

val Iconsax.Outline.Coin1: ImageVector
    get() {
        if (_Coin1 != null) {
            return _Coin1!!
        }
        _Coin1 = ImageVector.Builder(
            name = "Outline.Coin1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 22.75f)
                curveTo(8f, 22.75f, 4.75f, 19.88f, 4.75f, 16.35f)
                verticalLineTo(12.65f)
                curveTo(4.75f, 12.24f, 5.09f, 11.9f, 5.5f, 11.9f)
                curveTo(5.91f, 11.9f, 6.25f, 12.24f, 6.25f, 12.65f)
                curveTo(6.25f, 15.27f, 8.72f, 17.25f, 12f, 17.25f)
                curveTo(15.28f, 17.25f, 17.75f, 15.27f, 17.75f, 12.65f)
                curveTo(17.75f, 12.24f, 18.09f, 11.9f, 18.5f, 11.9f)
                curveTo(18.91f, 11.9f, 19.25f, 12.24f, 19.25f, 12.65f)
                verticalLineTo(16.35f)
                curveTo(19.25f, 19.88f, 16f, 22.75f, 12f, 22.75f)
                close()
                moveTo(6.25f, 16.46f)
                curveTo(6.32f, 19.11f, 8.87f, 21.25f, 12f, 21.25f)
                curveTo(15.13f, 21.25f, 17.68f, 19.11f, 17.75f, 16.46f)
                curveTo(16.45f, 17.87f, 14.39f, 18.75f, 12f, 18.75f)
                curveTo(9.61f, 18.75f, 7.56f, 17.87f, 6.25f, 16.46f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 13.75f)
                curveTo(9.24f, 13.75f, 6.76f, 12.51f, 5.55f, 10.51f)
                curveTo(5.03f, 9.66f, 4.75f, 8.67f, 4.75f, 7.65f)
                curveTo(4.75f, 5.93f, 5.52f, 4.31f, 6.91f, 3.09f)
                curveTo(8.27f, 1.9f, 10.08f, 1.25f, 12f, 1.25f)
                curveTo(13.92f, 1.25f, 15.72f, 1.9f, 17.09f, 3.08f)
                curveTo(18.48f, 4.31f, 19.25f, 5.93f, 19.25f, 7.65f)
                curveTo(19.25f, 8.67f, 18.97f, 9.65f, 18.45f, 10.51f)
                curveTo(17.24f, 12.51f, 14.76f, 13.75f, 12f, 13.75f)
                close()
                moveTo(12f, 2.75f)
                curveTo(10.44f, 2.75f, 8.98f, 3.27f, 7.89f, 4.23f)
                curveTo(6.83f, 5.15f, 6.25f, 6.37f, 6.25f, 7.65f)
                curveTo(6.25f, 8.4f, 6.45f, 9.1f, 6.83f, 9.73f)
                curveTo(7.78f, 11.29f, 9.76f, 12.25f, 12f, 12.25f)
                curveTo(14.24f, 12.25f, 16.22f, 11.28f, 17.17f, 9.73f)
                curveTo(17.56f, 9.1f, 17.75f, 8.4f, 17.75f, 7.65f)
                curveTo(17.75f, 6.37f, 17.17f, 5.15f, 16.1f, 4.21f)
                curveTo(15.01f, 3.27f, 13.56f, 2.75f, 12f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 18.75f)
                curveTo(7.87f, 18.75f, 4.75f, 16.13f, 4.75f, 12.65f)
                verticalLineTo(7.65f)
                curveTo(4.75f, 4.12f, 8f, 1.25f, 12f, 1.25f)
                curveTo(13.92f, 1.25f, 15.72f, 1.9f, 17.09f, 3.08f)
                curveTo(18.48f, 4.31f, 19.25f, 5.93f, 19.25f, 7.65f)
                verticalLineTo(12.65f)
                curveTo(19.25f, 16.13f, 16.13f, 18.75f, 12f, 18.75f)
                close()
                moveTo(12f, 2.75f)
                curveTo(8.83f, 2.75f, 6.25f, 4.95f, 6.25f, 7.65f)
                verticalLineTo(12.65f)
                curveTo(6.25f, 15.27f, 8.72f, 17.25f, 12f, 17.25f)
                curveTo(15.28f, 17.25f, 17.75f, 15.27f, 17.75f, 12.65f)
                verticalLineTo(7.65f)
                curveTo(17.75f, 6.37f, 17.17f, 5.15f, 16.1f, 4.21f)
                curveTo(15.01f, 3.27f, 13.56f, 2.75f, 12f, 2.75f)
                close()
            }
        }.build()

        return _Coin1!!
    }

@Suppress("ObjectPropertyName")
private var _Coin1: ImageVector? = null
