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

val Iconsax.Filled.BagCross: ImageVector
    get() {
        if (_BagCross != null) {
            return _BagCross!!
        }
        _BagCross = ImageVector.Builder(
            name = "Filled.BagCross",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.96f, 8.958f)
                curveTo(19.29f, 8.218f, 18.28f, 7.788f, 16.88f, 7.638f)
                verticalLineTo(6.878f)
                curveTo(16.88f, 5.508f, 16.3f, 4.188f, 15.28f, 3.268f)
                curveTo(14.25f, 2.328f, 12.91f, 1.888f, 11.52f, 2.018f)
                curveTo(9.13f, 2.248f, 7.12f, 4.558f, 7.12f, 7.058f)
                verticalLineTo(7.638f)
                curveTo(5.72f, 7.788f, 4.71f, 8.218f, 4.04f, 8.958f)
                curveTo(3.07f, 10.038f, 3.1f, 11.478f, 3.21f, 12.478f)
                lineTo(3.91f, 18.048f)
                curveTo(4.12f, 19.998f, 4.91f, 21.998f, 9.21f, 21.998f)
                horizontalLineTo(14.79f)
                curveTo(19.09f, 21.998f, 19.88f, 19.998f, 20.09f, 18.058f)
                lineTo(20.79f, 12.468f)
                curveTo(20.9f, 11.478f, 20.93f, 10.038f, 19.96f, 8.958f)
                close()
                moveTo(11.66f, 3.408f)
                curveTo(12.66f, 3.318f, 13.61f, 3.628f, 14.35f, 4.298f)
                curveTo(15.08f, 4.958f, 15.49f, 5.898f, 15.49f, 6.878f)
                verticalLineTo(7.578f)
                horizontalLineTo(8.51f)
                verticalLineTo(7.058f)
                curveTo(8.51f, 5.278f, 9.98f, 3.568f, 11.66f, 3.408f)
                close()
                moveTo(12f, 18.578f)
                curveTo(9.91f, 18.578f, 8.21f, 16.878f, 8.21f, 14.788f)
                curveTo(8.21f, 12.698f, 9.91f, 10.998f, 12f, 10.998f)
                curveTo(14.09f, 10.998f, 15.79f, 12.698f, 15.79f, 14.788f)
                curveTo(15.79f, 16.878f, 14.09f, 18.578f, 12f, 18.578f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.599f, 15.31f)
                lineTo(13.069f, 14.78f)
                lineTo(13.569f, 14.28f)
                curveTo(13.859f, 13.99f, 13.859f, 13.51f, 13.569f, 13.22f)
                curveTo(13.279f, 12.93f, 12.799f, 12.93f, 12.509f, 13.22f)
                lineTo(12.009f, 13.72f)
                lineTo(11.479f, 13.19f)
                curveTo(11.189f, 12.9f, 10.709f, 12.9f, 10.419f, 13.19f)
                curveTo(10.129f, 13.48f, 10.129f, 13.96f, 10.419f, 14.25f)
                lineTo(10.949f, 14.78f)
                lineTo(10.399f, 15.33f)
                curveTo(10.109f, 15.62f, 10.109f, 16.1f, 10.399f, 16.39f)
                curveTo(10.549f, 16.54f, 10.739f, 16.61f, 10.929f, 16.61f)
                curveTo(11.119f, 16.61f, 11.309f, 16.54f, 11.459f, 16.39f)
                lineTo(12.009f, 15.84f)
                lineTo(12.539f, 16.37f)
                curveTo(12.689f, 16.52f, 12.879f, 16.59f, 13.069f, 16.59f)
                curveTo(13.259f, 16.59f, 13.449f, 16.52f, 13.599f, 16.37f)
                curveTo(13.889f, 16.08f, 13.889f, 15.61f, 13.599f, 15.31f)
                close()
            }
        }.build()

        return _BagCross!!
    }

@Suppress("ObjectPropertyName")
private var _BagCross: ImageVector? = null
