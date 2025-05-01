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

val Iconsax.Outline.CodeCircle: ImageVector
    get() {
        if (_CodeCircle != null) {
            return _CodeCircle!!
        }
        _CodeCircle = ImageVector.Builder(
            name = "Outline.CodeCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7.999f, 14.75f)
                curveTo(7.809f, 14.75f, 7.619f, 14.68f, 7.469f, 14.53f)
                lineTo(5.469f, 12.53f)
                curveTo(5.179f, 12.24f, 5.179f, 11.76f, 5.469f, 11.47f)
                lineTo(7.469f, 9.47f)
                curveTo(7.759f, 9.18f, 8.239f, 9.18f, 8.529f, 9.47f)
                curveTo(8.819f, 9.76f, 8.819f, 10.24f, 8.529f, 10.53f)
                lineTo(7.059f, 12f)
                lineTo(8.529f, 13.47f)
                curveTo(8.819f, 13.76f, 8.819f, 14.24f, 8.529f, 14.53f)
                curveTo(8.379f, 14.68f, 8.189f, 14.75f, 7.999f, 14.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16f, 14.75f)
                curveTo(15.809f, 14.75f, 15.62f, 14.68f, 15.469f, 14.53f)
                curveTo(15.179f, 14.24f, 15.179f, 13.76f, 15.469f, 13.47f)
                lineTo(16.94f, 12f)
                lineTo(15.469f, 10.53f)
                curveTo(15.179f, 10.24f, 15.179f, 9.76f, 15.469f, 9.47f)
                curveTo(15.759f, 9.18f, 16.24f, 9.18f, 16.529f, 9.47f)
                lineTo(18.529f, 11.47f)
                curveTo(18.819f, 11.76f, 18.819f, 12.24f, 18.529f, 12.53f)
                lineTo(16.529f, 14.53f)
                curveTo(16.379f, 14.68f, 16.19f, 14.75f, 16f, 14.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 22.75f)
                curveTo(6.07f, 22.75f, 1.25f, 17.93f, 1.25f, 12f)
                curveTo(1.25f, 6.07f, 6.07f, 1.25f, 12f, 1.25f)
                curveTo(17.93f, 1.25f, 22.75f, 6.07f, 22.75f, 12f)
                curveTo(22.75f, 17.93f, 17.93f, 22.75f, 12f, 22.75f)
                close()
                moveTo(12f, 2.75f)
                curveTo(6.9f, 2.75f, 2.75f, 6.9f, 2.75f, 12f)
                curveTo(2.75f, 17.1f, 6.9f, 21.25f, 12f, 21.25f)
                curveTo(17.1f, 21.25f, 21.25f, 17.1f, 21.25f, 12f)
                curveTo(21.25f, 6.9f, 17.1f, 2.75f, 12f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11f, 15.08f)
                curveTo(10.9f, 15.08f, 10.8f, 15.06f, 10.71f, 15.02f)
                curveTo(10.33f, 14.86f, 10.15f, 14.42f, 10.32f, 14.03f)
                lineTo(12.32f, 9.36f)
                curveTo(12.48f, 8.98f, 12.92f, 8.8f, 13.3f, 8.97f)
                curveTo(13.68f, 9.13f, 13.86f, 9.57f, 13.69f, 9.96f)
                lineTo(11.69f, 14.63f)
                curveTo(11.57f, 14.91f, 11.29f, 15.08f, 11f, 15.08f)
                close()
            }
        }.build()

        return _CodeCircle!!
    }

@Suppress("ObjectPropertyName")
private var _CodeCircle: ImageVector? = null
