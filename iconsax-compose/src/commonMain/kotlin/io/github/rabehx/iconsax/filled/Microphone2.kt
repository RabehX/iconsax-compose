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


val Iconsax.Filled.Microphone2: ImageVector
    get() {
        if (_Microphone2 != null) {
            return _Microphone2!!
        }
        _Microphone2 = ImageVector.Builder(
            name = "Filled.Microphone2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.12f, 9.119f)
                curveTo(18.73f, 9.119f, 18.42f, 9.429f, 18.42f, 9.819f)
                verticalLineTo(11.399f)
                curveTo(18.42f, 14.939f, 15.54f, 17.819f, 12f, 17.819f)
                curveTo(8.46f, 17.819f, 5.58f, 14.939f, 5.58f, 11.399f)
                verticalLineTo(9.809f)
                curveTo(5.58f, 9.419f, 5.27f, 9.109f, 4.88f, 9.109f)
                curveTo(4.49f, 9.109f, 4.18f, 9.419f, 4.18f, 9.809f)
                verticalLineTo(11.389f)
                curveTo(4.18f, 15.459f, 7.31f, 18.809f, 11.3f, 19.169f)
                verticalLineTo(21.299f)
                curveTo(11.3f, 21.689f, 11.61f, 21.999f, 12f, 21.999f)
                curveTo(12.39f, 21.999f, 12.7f, 21.689f, 12.7f, 21.299f)
                verticalLineTo(19.169f)
                curveTo(16.68f, 18.819f, 19.82f, 15.459f, 19.82f, 11.389f)
                verticalLineTo(9.809f)
                curveTo(19.81f, 9.429f, 19.5f, 9.119f, 19.12f, 9.119f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.998f, 2f)
                curveTo(9.558f, 2f, 7.578f, 3.98f, 7.578f, 6.42f)
                verticalLineTo(11.54f)
                curveTo(7.578f, 13.98f, 9.558f, 15.96f, 11.998f, 15.96f)
                curveTo(14.438f, 15.96f, 16.418f, 13.98f, 16.418f, 11.54f)
                verticalLineTo(6.42f)
                curveTo(16.418f, 3.98f, 14.438f, 2f, 11.998f, 2f)
                close()
                moveTo(13.308f, 8.95f)
                curveTo(13.238f, 9.21f, 13.008f, 9.38f, 12.748f, 9.38f)
                curveTo(12.698f, 9.38f, 12.648f, 9.37f, 12.598f, 9.36f)
                curveTo(12.208f, 9.25f, 11.798f, 9.25f, 11.408f, 9.36f)
                curveTo(11.088f, 9.45f, 10.778f, 9.26f, 10.698f, 8.95f)
                curveTo(10.608f, 8.64f, 10.798f, 8.32f, 11.108f, 8.24f)
                curveTo(11.698f, 8.08f, 12.318f, 8.08f, 12.908f, 8.24f)
                curveTo(13.208f, 8.32f, 13.388f, 8.64f, 13.308f, 8.95f)
                close()
                moveTo(13.838f, 7.01f)
                curveTo(13.748f, 7.25f, 13.528f, 7.39f, 13.288f, 7.39f)
                curveTo(13.218f, 7.39f, 13.158f, 7.38f, 13.088f, 7.36f)
                curveTo(12.388f, 7.1f, 11.608f, 7.1f, 10.908f, 7.36f)
                curveTo(10.608f, 7.47f, 10.268f, 7.31f, 10.158f, 7.01f)
                curveTo(10.048f, 6.71f, 10.208f, 6.37f, 10.508f, 6.27f)
                curveTo(11.468f, 5.92f, 12.528f, 5.92f, 13.488f, 6.27f)
                curveTo(13.788f, 6.38f, 13.948f, 6.71f, 13.838f, 7.01f)
                close()
            }
        }.build()

        return _Microphone2!!
    }

@Suppress("ObjectPropertyName")
private var _Microphone2: ImageVector? = null
