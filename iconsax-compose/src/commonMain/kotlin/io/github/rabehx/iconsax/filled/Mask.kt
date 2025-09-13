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


val Iconsax.Filled.Mask: ImageVector
    get() {
        if (_Mask != null) {
            return _Mask!!
        }
        _Mask = ImageVector.Builder(
            name = "Filled.Mask",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.24f, 9.52f)
                lineTo(20.95f, 14.23f)
                curveTo(21.23f, 14.51f, 21.72f, 14.36f, 21.8f, 13.97f)
                curveTo(21.93f, 13.33f, 22f, 12.67f, 22f, 12f)
                curveTo(22f, 9.71f, 21.22f, 7.6f, 19.93f, 5.92f)
                curveTo(19.75f, 5.68f, 19.39f, 5.67f, 19.18f, 5.88f)
                lineTo(16.24f, 8.82f)
                curveTo(16.05f, 9.01f, 16.05f, 9.33f, 16.24f, 9.52f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.481f, 10.58f)
                lineTo(12.71f, 12.35f)
                curveTo(12.51f, 12.55f, 12.51f, 12.86f, 12.71f, 13.06f)
                lineTo(18.531f, 18.88f)
                curveTo(18.73f, 19.08f, 19.051f, 19.08f, 19.24f, 18.88f)
                curveTo(19.861f, 18.23f, 20.39f, 17.5f, 20.82f, 16.71f)
                curveTo(20.92f, 16.52f, 20.881f, 16.27f, 20.73f, 16.12f)
                lineTo(15.191f, 10.58f)
                curveTo(14.991f, 10.39f, 14.67f, 10.39f, 14.481f, 10.58f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10.939f, 14.12f)
                lineTo(9.179f, 15.88f)
                curveTo(8.979f, 16.08f, 8.979f, 16.39f, 9.179f, 16.59f)
                lineTo(14.099f, 21.52f)
                curveTo(14.229f, 21.65f, 14.419f, 21.7f, 14.589f, 21.65f)
                curveTo(15.519f, 21.4f, 16.399f, 21.02f, 17.199f, 20.52f)
                curveTo(17.469f, 20.35f, 17.509f, 19.97f, 17.279f, 19.74f)
                lineTo(11.649f, 14.11f)
                curveTo(11.449f, 13.93f, 11.129f, 13.93f, 10.939f, 14.12f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.08f, 4.07f)
                curveTo(16.1f, 2.54f, 13.53f, 1.74f, 10.77f, 2.07f)
                curveTo(6.26f, 2.61f, 2.61f, 6.27f, 2.07f, 10.77f)
                curveTo(1.74f, 13.53f, 2.54f, 16.09f, 4.07f, 18.08f)
                curveTo(4.25f, 18.32f, 4.61f, 18.33f, 4.82f, 18.12f)
                lineTo(18.12f, 4.82f)
                curveTo(18.33f, 4.61f, 18.32f, 4.25f, 18.08f, 4.07f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7.4f, 17.67f)
                lineTo(5.88f, 19.19f)
                curveTo(5.67f, 19.399f, 5.68f, 19.76f, 5.92f, 19.94f)
                curveTo(7.43f, 21.11f, 9.28f, 21.85f, 11.31f, 21.99f)
                curveTo(11.74f, 22.02f, 11.95f, 21.51f, 11.64f, 21.199f)
                lineTo(8.11f, 17.67f)
                curveTo(7.92f, 17.469f, 7.6f, 17.469f, 7.4f, 17.67f)
                close()
            }
        }.build()

        return _Mask!!
    }

@Suppress("ObjectPropertyName")
private var _Mask: ImageVector? = null
