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

val Iconsax.Outline.Setting: ImageVector
    get() {
        if (_Setting != null) {
            return _Setting!!
        }
        _Setting = ImageVector.Builder(
            name = "Outline.Setting",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 22.63f)
                curveTo(11.33f, 22.63f, 10.65f, 22.48f, 10.12f, 22.17f)
                lineTo(4.62f, 19f)
                curveTo(2.38f, 17.49f, 2.24f, 17.26f, 2.24f, 14.89f)
                verticalLineTo(9.11f)
                curveTo(2.24f, 6.74f, 2.37f, 6.51f, 4.57f, 5.02f)
                lineTo(10.11f, 1.82f)
                curveTo(11.16f, 1.21f, 12.81f, 1.21f, 13.86f, 1.82f)
                lineTo(19.38f, 5f)
                curveTo(21.62f, 6.51f, 21.76f, 6.74f, 21.76f, 9.11f)
                verticalLineTo(14.88f)
                curveTo(21.76f, 17.25f, 21.63f, 17.48f, 19.43f, 18.97f)
                lineTo(13.89f, 22.17f)
                curveTo(13.35f, 22.48f, 12.67f, 22.63f, 12f, 22.63f)
                close()
                moveTo(12f, 2.87f)
                curveTo(11.58f, 2.87f, 11.17f, 2.95f, 10.88f, 3.12f)
                lineTo(5.38f, 6.3f)
                curveTo(3.75f, 7.4f, 3.75f, 7.4f, 3.75f, 9.11f)
                verticalLineTo(14.88f)
                curveTo(3.75f, 16.59f, 3.75f, 16.59f, 5.42f, 17.72f)
                lineTo(10.88f, 20.87f)
                curveTo(11.47f, 21.21f, 12.54f, 21.21f, 13.13f, 20.87f)
                lineTo(18.63f, 17.69f)
                curveTo(20.25f, 16.59f, 20.25f, 16.59f, 20.25f, 14.88f)
                verticalLineTo(9.11f)
                curveTo(20.25f, 7.4f, 20.25f, 7.4f, 18.58f, 6.27f)
                lineTo(13.12f, 3.12f)
                curveTo(12.83f, 2.95f, 12.42f, 2.87f, 12f, 2.87f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 15.75f)
                curveTo(9.93f, 15.75f, 8.25f, 14.07f, 8.25f, 12f)
                curveTo(8.25f, 9.93f, 9.93f, 8.25f, 12f, 8.25f)
                curveTo(14.07f, 8.25f, 15.75f, 9.93f, 15.75f, 12f)
                curveTo(15.75f, 14.07f, 14.07f, 15.75f, 12f, 15.75f)
                close()
                moveTo(12f, 9.75f)
                curveTo(10.76f, 9.75f, 9.75f, 10.76f, 9.75f, 12f)
                curveTo(9.75f, 13.24f, 10.76f, 14.25f, 12f, 14.25f)
                curveTo(13.24f, 14.25f, 14.25f, 13.24f, 14.25f, 12f)
                curveTo(14.25f, 10.76f, 13.24f, 9.75f, 12f, 9.75f)
                close()
            }
        }.build()

        return _Setting!!
    }

@Suppress("ObjectPropertyName")
private var _Setting: ImageVector? = null
