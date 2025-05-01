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


val Iconsax.Filled.CodeCircle: ImageVector
    get() {
        if (_CodeCircle != null) {
            return _CodeCircle!!
        }
        _CodeCircle = ImageVector.Builder(
            name = "Filled.CodeCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 2f)
                curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                curveTo(2f, 17.52f, 6.48f, 22f, 12f, 22f)
                curveTo(17.52f, 22f, 22f, 17.52f, 22f, 12f)
                curveTo(22f, 6.48f, 17.52f, 2f, 12f, 2f)
                close()
                moveTo(8.53f, 13.47f)
                curveTo(8.82f, 13.76f, 8.82f, 14.24f, 8.53f, 14.53f)
                curveTo(8.38f, 14.68f, 8.19f, 14.75f, 8f, 14.75f)
                curveTo(7.81f, 14.75f, 7.62f, 14.68f, 7.47f, 14.53f)
                lineTo(5.47f, 12.53f)
                curveTo(5.18f, 12.24f, 5.18f, 11.76f, 5.47f, 11.47f)
                lineTo(7.47f, 9.47f)
                curveTo(7.76f, 9.18f, 8.24f, 9.18f, 8.53f, 9.47f)
                curveTo(8.82f, 9.76f, 8.82f, 10.24f, 8.53f, 10.53f)
                lineTo(7.06f, 12f)
                lineTo(8.53f, 13.47f)
                close()
                moveTo(13.69f, 9.96f)
                lineTo(11.69f, 14.63f)
                curveTo(11.57f, 14.91f, 11.29f, 15.08f, 11f, 15.08f)
                curveTo(10.9f, 15.08f, 10.8f, 15.06f, 10.71f, 15.02f)
                curveTo(10.33f, 14.86f, 10.15f, 14.42f, 10.32f, 14.03f)
                lineTo(12.32f, 9.36f)
                curveTo(12.48f, 8.98f, 12.92f, 8.8f, 13.3f, 8.97f)
                curveTo(13.68f, 9.14f, 13.85f, 9.58f, 13.69f, 9.96f)
                close()
                moveTo(18.53f, 12.53f)
                lineTo(16.53f, 14.53f)
                curveTo(16.38f, 14.68f, 16.19f, 14.75f, 16f, 14.75f)
                curveTo(15.81f, 14.75f, 15.62f, 14.68f, 15.47f, 14.53f)
                curveTo(15.18f, 14.24f, 15.18f, 13.76f, 15.47f, 13.47f)
                lineTo(16.94f, 12f)
                lineTo(15.47f, 10.53f)
                curveTo(15.18f, 10.24f, 15.18f, 9.76f, 15.47f, 9.47f)
                curveTo(15.76f, 9.18f, 16.24f, 9.18f, 16.53f, 9.47f)
                lineTo(18.53f, 11.47f)
                curveTo(18.82f, 11.76f, 18.82f, 12.24f, 18.53f, 12.53f)
                close()
            }
        }.build()

        return _CodeCircle!!
    }

@Suppress("ObjectPropertyName")
private var _CodeCircle: ImageVector? = null
