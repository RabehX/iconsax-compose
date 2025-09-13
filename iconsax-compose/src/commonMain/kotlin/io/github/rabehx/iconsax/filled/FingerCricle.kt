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


val Iconsax.Filled.FingerCricle: ImageVector
    get() {
        if (_FingerCricle != null) {
            return _FingerCricle!!
        }
        _FingerCricle = ImageVector.Builder(
            name = "Filled.FingerCricle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 7.949f)
                curveTo(10.21f, 7.949f, 8.75f, 9.409f, 8.75f, 11.199f)
                verticalLineTo(12.799f)
                curveTo(8.75f, 14.589f, 10.21f, 16.049f, 12f, 16.049f)
                curveTo(13.79f, 16.049f, 15.25f, 14.589f, 15.25f, 12.799f)
                verticalLineTo(11.199f)
                curveTo(15.25f, 9.409f, 13.79f, 7.949f, 12f, 7.949f)
                close()
                moveTo(12.9f, 13.239f)
                curveTo(12.9f, 13.739f, 12.5f, 14.139f, 12f, 14.139f)
                curveTo(11.5f, 14.139f, 11.1f, 13.739f, 11.1f, 13.239f)
                verticalLineTo(10.769f)
                curveTo(11.1f, 10.279f, 11.5f, 9.869f, 12f, 9.869f)
                curveTo(12.5f, 9.869f, 12.9f, 10.269f, 12.9f, 10.769f)
                verticalLineTo(13.239f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 2f)
                curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                curveTo(2f, 17.52f, 6.48f, 22f, 12f, 22f)
                curveTo(17.52f, 22f, 22f, 17.52f, 22f, 12f)
                curveTo(22f, 6.48f, 17.52f, 2f, 12f, 2f)
                close()
                moveTo(16.75f, 12.8f)
                curveTo(16.75f, 15.42f, 14.62f, 17.55f, 12f, 17.55f)
                curveTo(9.38f, 17.55f, 7.25f, 15.42f, 7.25f, 12.8f)
                verticalLineTo(11.2f)
                curveTo(7.25f, 8.58f, 9.38f, 6.45f, 12f, 6.45f)
                curveTo(14.62f, 6.45f, 16.75f, 8.58f, 16.75f, 11.2f)
                verticalLineTo(12.8f)
                close()
            }
        }.build()

        return _FingerCricle!!
    }

@Suppress("ObjectPropertyName")
private var _FingerCricle: ImageVector? = null
