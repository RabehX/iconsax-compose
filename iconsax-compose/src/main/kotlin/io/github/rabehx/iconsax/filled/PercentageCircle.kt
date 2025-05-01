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


val Iconsax.Filled.PercentageCircle: ImageVector
    get() {
        if (_PercentageCircle != null) {
            return _PercentageCircle!!
        }
        _PercentageCircle = ImageVector.Builder(
            name = "Filled.PercentageCircle",
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
                moveTo(8.73f, 7.66f)
                curveTo(9.54f, 7.66f, 10.21f, 8.32f, 10.21f, 9.14f)
                curveTo(10.21f, 9.95f, 9.55f, 10.62f, 8.73f, 10.62f)
                curveTo(7.92f, 10.62f, 7.25f, 9.96f, 7.25f, 9.14f)
                curveTo(7.25f, 8.32f, 7.91f, 7.66f, 8.73f, 7.66f)
                close()
                moveTo(8.85f, 15.8f)
                curveTo(8.7f, 15.95f, 8.51f, 16.02f, 8.32f, 16.02f)
                curveTo(8.13f, 16.02f, 7.94f, 15.95f, 7.79f, 15.8f)
                curveTo(7.5f, 15.51f, 7.5f, 15.03f, 7.79f, 14.74f)
                lineTo(14.34f, 8.19f)
                curveTo(14.63f, 7.9f, 15.11f, 7.9f, 15.4f, 8.19f)
                curveTo(15.69f, 8.48f, 15.69f, 8.96f, 15.4f, 9.25f)
                lineTo(8.85f, 15.8f)
                close()
                moveTo(15.27f, 16.34f)
                curveTo(14.46f, 16.34f, 13.79f, 15.68f, 13.79f, 14.86f)
                curveTo(13.79f, 14.05f, 14.45f, 13.38f, 15.27f, 13.38f)
                curveTo(16.08f, 13.38f, 16.75f, 14.04f, 16.75f, 14.86f)
                curveTo(16.75f, 15.68f, 16.09f, 16.34f, 15.27f, 16.34f)
                close()
            }
        }.build()

        return _PercentageCircle!!
    }

@Suppress("ObjectPropertyName")
private var _PercentageCircle: ImageVector? = null
