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

val Iconsax.Outline.ShieldSlash: ImageVector
    get() {
        if (_ShieldSlash != null) {
            return _ShieldSlash!!
        }
        _ShieldSlash = ImageVector.Builder(
            name = "Outline.ShieldSlash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 22.76f)
                curveTo(10.91f, 22.76f, 9.83f, 22.44f, 8.98f, 21.81f)
                lineTo(7.39f, 20.62f)
                curveTo(7.06f, 20.37f, 6.99f, 19.9f, 7.24f, 19.57f)
                curveTo(7.49f, 19.24f, 7.96f, 19.17f, 8.29f, 19.42f)
                lineTo(9.88f, 20.61f)
                curveTo(11.03f, 21.47f, 12.98f, 21.47f, 14.13f, 20.61f)
                lineTo(18.43f, 17.4f)
                curveTo(19.19f, 16.83f, 19.85f, 15.5f, 19.85f, 14.56f)
                verticalLineTo(7.12f)
                curveTo(19.85f, 6.71f, 20.19f, 6.37f, 20.6f, 6.37f)
                curveTo(21.01f, 6.37f, 21.35f, 6.71f, 21.35f, 7.12f)
                verticalLineTo(14.55f)
                curveTo(21.35f, 15.97f, 20.46f, 17.74f, 19.32f, 18.59f)
                lineTo(15.02f, 21.8f)
                curveTo(14.17f, 22.44f, 13.09f, 22.76f, 12f, 22.76f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5.33f, 18.9f)
                curveTo(5.17f, 18.9f, 5.02f, 18.85f, 4.88f, 18.75f)
                lineTo(4.68f, 18.6f)
                curveTo(3.54f, 17.75f, 2.65f, 15.97f, 2.65f, 14.56f)
                verticalLineTo(7.12f)
                curveTo(2.65f, 5.58f, 3.78f, 3.94f, 5.23f, 3.4f)
                lineTo(10.22f, 1.53f)
                curveTo(11.21f, 1.16f, 12.77f, 1.16f, 13.76f, 1.53f)
                lineTo(18.76f, 3.4f)
                curveTo(18.97f, 3.48f, 19.17f, 3.58f, 19.37f, 3.7f)
                curveTo(19.72f, 3.92f, 19.83f, 4.38f, 19.61f, 4.73f)
                curveTo(19.39f, 5.08f, 18.93f, 5.19f, 18.58f, 4.97f)
                curveTo(18.47f, 4.9f, 18.36f, 4.84f, 18.24f, 4.8f)
                lineTo(13.24f, 2.93f)
                curveTo(12.58f, 2.68f, 11.41f, 2.68f, 10.75f, 2.93f)
                lineTo(5.76f, 4.81f)
                curveTo(4.9f, 5.13f, 4.15f, 6.21f, 4.15f, 7.13f)
                verticalLineTo(14.56f)
                curveTo(4.15f, 15.51f, 4.82f, 16.84f, 5.57f, 17.4f)
                lineTo(5.77f, 17.55f)
                curveTo(6.1f, 17.8f, 6.17f, 18.27f, 5.92f, 18.6f)
                curveTo(5.79f, 18.79f, 5.56f, 18.9f, 5.33f, 18.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(1.999f, 22.75f)
                curveTo(1.809f, 22.75f, 1.619f, 22.68f, 1.469f, 22.53f)
                curveTo(1.179f, 22.24f, 1.179f, 21.76f, 1.469f, 21.47f)
                lineTo(21.469f, 1.47f)
                curveTo(21.76f, 1.18f, 22.24f, 1.18f, 22.529f, 1.47f)
                curveTo(22.819f, 1.76f, 22.819f, 2.24f, 22.529f, 2.53f)
                lineTo(2.529f, 22.53f)
                curveTo(2.379f, 22.68f, 2.189f, 22.75f, 1.999f, 22.75f)
                close()
            }
        }.build()

        return _ShieldSlash!!
    }

@Suppress("ObjectPropertyName")
private var _ShieldSlash: ImageVector? = null
