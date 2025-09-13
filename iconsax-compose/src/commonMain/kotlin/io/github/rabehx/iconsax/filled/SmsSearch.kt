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


val Iconsax.Filled.SmsSearch: ImageVector
    get() {
        if (_SmsSearch != null) {
            return _SmsSearch!!
        }
        _SmsSearch = ImageVector.Builder(
            name = "Filled.SmsSearch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17f, 3f)
                horizontalLineTo(7f)
                curveTo(4f, 3f, 2f, 4.5f, 2f, 8f)
                verticalLineTo(15.96f)
                curveTo(2f, 18.25f, 3.85f, 20.1f, 6.14f, 20.1f)
                horizontalLineTo(12.4f)
                curveTo(12.98f, 20.1f, 13.48f, 19.61f, 13.42f, 19.03f)
                curveTo(13.28f, 17.5f, 13.78f, 15.85f, 15.14f, 14.52f)
                curveTo(15.7f, 13.97f, 16.39f, 13.55f, 17.14f, 13.31f)
                curveTo(18.39f, 12.91f, 19.6f, 12.96f, 20.67f, 13.33f)
                curveTo(21.32f, 13.55f, 22f, 13.08f, 22f, 12.39f)
                verticalLineTo(8f)
                curveTo(22f, 4.5f, 20f, 3f, 17f, 3f)
                close()
                moveTo(17.47f, 8.59f)
                lineTo(14.34f, 11.09f)
                curveTo(13.68f, 11.62f, 12.84f, 11.88f, 12f, 11.88f)
                curveTo(11.16f, 11.88f, 10.31f, 11.62f, 9.66f, 11.09f)
                lineTo(6.53f, 8.59f)
                curveTo(6.21f, 8.33f, 6.16f, 7.86f, 6.41f, 7.53f)
                curveTo(6.67f, 7.21f, 7.14f, 7.15f, 7.46f, 7.41f)
                lineTo(10.59f, 9.91f)
                curveTo(11.35f, 10.52f, 12.64f, 10.52f, 13.4f, 9.91f)
                lineTo(16.53f, 7.41f)
                curveTo(16.85f, 7.15f, 17.33f, 7.2f, 17.58f, 7.53f)
                curveTo(17.84f, 7.86f, 17.79f, 8.33f, 17.47f, 8.59f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22.65f, 21.449f)
                lineTo(21.9f, 20.699f)
                curveTo(22.29f, 20.109f, 22.52f, 19.399f, 22.52f, 18.639f)
                curveTo(22.52f, 16.559f, 20.84f, 14.879f, 18.76f, 14.879f)
                curveTo(16.68f, 14.879f, 15f, 16.559f, 15f, 18.629f)
                curveTo(15f, 20.699f, 16.68f, 22.389f, 18.76f, 22.389f)
                curveTo(19.52f, 22.389f, 20.23f, 22.159f, 20.82f, 21.769f)
                lineTo(21.57f, 22.519f)
                curveTo(21.72f, 22.669f, 21.91f, 22.739f, 22.11f, 22.739f)
                curveTo(22.31f, 22.739f, 22.5f, 22.669f, 22.65f, 22.519f)
                curveTo(22.95f, 22.229f, 22.95f, 21.749f, 22.65f, 21.449f)
                close()
            }
        }.build()

        return _SmsSearch!!
    }

@Suppress("ObjectPropertyName")
private var _SmsSearch: ImageVector? = null
